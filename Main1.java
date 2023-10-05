package inheritanceInterface;
interface CreditCardInterface {
    void viewCreditAmount();
    boolean useCard(double amount);
    boolean payCard(double amount);
    void increaseLimit(double increaseAmount);
}


class SolverCardCustomer implements CreditCardInterface {
    private String name;
    private String cardNumber;
    private double creditAmount;
    protected double creditLimit;

    public SolverCardCustomer(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.creditAmount = 0;
        this.creditLimit = 50000;
    }

  
    public void viewCreditAmount() {
        System.out.println("Credit Amount for " + name + ": $" + creditAmount);
    }

   
    public boolean useCard(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid transaction amount.");
            return false;
        }

        if (amount <= creditLimit - creditAmount) {
            creditAmount += amount;
            System.out.println("Transaction successful. New credit amount: $" + creditAmount);
            return true;
        } else {
            System.out.println("Transaction failed. Credit limit exceeded.");
            return false;
        }
    }

 
    public boolean payCard(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
            return false;
        }

        if (amount <= creditAmount) {
            creditAmount -= amount;
            System.out.println("Payment successful. New credit amount: $" + creditAmount);
            return true;
        } else {
            System.out.println("Payment failed. Insufficient credit amount.");
            return false;
        }
    }

    
    public void increaseLimit(double increaseAmount) {
        System.out.println("Increase Limit is not available for SolverCardCustomer.");
    }
}


class GoldCardCustomer extends SolverCardCustomer {
    private int increaseLimitCount;
    private static final double MAX_INCREASE_AMOUNT = 5000;
    private static final int MAX_INCREASE_LIMIT_COUNT = 3;

    public GoldCardCustomer(String name, String cardNumber) {
        super(name, cardNumber);
        this.creditLimit = 100000;
        this.increaseLimitCount = 0;
    }

    @Override
    public void increaseLimit(double increaseAmount) {
        if (increaseLimitCount < MAX_INCREASE_LIMIT_COUNT) {
            if (increaseAmount > 0 && increaseAmount <= MAX_INCREASE_AMOUNT) {
                creditLimit += increaseAmount;
                System.out.println("Credit limit increased to $" + creditLimit);
                increaseLimitCount++;
            } else {
                System.out.println("Invalid increase amount.");
            }
        } else {
            System.out.println("You have reached the maximum limit increase count.");
        }
    }
}
public class Main1 {

	public static void main(String[] args) {
       
        SolverCardCustomer solverCustomer = new SolverCardCustomer("Alice", "1234567890123456");
        solverCustomer.viewCreditAmount();
        solverCustomer.useCard(20000);
        solverCustomer.payCard(5000);
        solverCustomer.viewCreditAmount();

       
        GoldCardCustomer goldCustomer = new GoldCardCustomer("Bob", "9876543210987654");
        goldCustomer.viewCreditAmount();
        goldCustomer.useCard(60000);
        goldCustomer.increaseLimit(3000); 
        goldCustomer.increaseLimit(2000); 
        goldCustomer.increaseLimit(3000);
        goldCustomer.viewCreditAmount();
    }
}