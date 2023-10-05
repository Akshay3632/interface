package inheritanceInterface;
class Vehicle {
    String company;
    double price;

    public Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }

    public String getInfo() {
        return "Company: " + company + ", Price: " + price;
    }
}

class LightMotorVehicle extends Vehicle {
    double mileage;

    public LightMotorVehicle(String company, double price, double mileage) {
        super(company, price);
        this.mileage = mileage;
    }

  
    public String getInfo() {
        return super.getInfo() + ", Mileage: " + mileage + " km/l";
    }
}

class HeavyMotorVehicle extends Vehicle {
    double capacityInTons;

    public HeavyMotorVehicle(String company, double price, double capacityInTons) {
        super(company, price);
        this.capacityInTons = capacityInTons;
    }

    
    public String getInfo() {
        return super.getInfo() + ", Capacity in Tons: " + capacityInTons + " tons";
    }
}
public class VehicleApp {

	public static void main(String[] args) {
		
		Vehicle[] vehicles = new Vehicle[2]; 
        
        vehicles[0] = new LightMotorVehicle("Company A", 15000.0, 20.5);
        vehicles[1] = new HeavyMotorVehicle("Company B", 50000.0, 5.0);

        
        System.out.println("Vehicle Information:");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Vehicle " + (i + 1) + ": " + vehicles[i].getInfo());
        }
    }
}