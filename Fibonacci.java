package Series;

public class Fibonacci {

	 public static void printFibonacci(int n){
		// TODO Auto-generated method stub
		 int a = 0, b = 1;
	        System.out.print("Fibonacci Series: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a + " ");
	            int next = a + b;
	            a = b;
	            b = next;
	        }
	        System.out.println();
	}

}
