package inheritanceInterface;
class Student {
    private int rollno;
    private String name;
    private static int objectCount = 0; 

    
    public Student() {
        objectCount++; 
        System.out.println("Object created. Object Count: " + objectCount);
    }

    
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        objectCount++; 
        System.out.println("Object created. Object Count: " + objectCount);
    }

    
    public String toString() {
        return "Roll Number: " + rollno + ", Name: " + name;
    }

    
    public static int getObjectCount() {
        return objectCount;
    }
}

public class StudentApp {

	public static void main(String[] args) {
		

		 Student student1 = new Student(101, "John");
	        System.out.println(student1);

	        Student student2 = new Student(102, "Alice");
	        System.out.println(student2);

	       
	        System.out.println("Total Object Count: " + Student.getObjectCount());

	      
	        Student student3 = new Student();
	        System.out.println(student3);

	        
	        System.out.println("Total Object Count: " + Student.getObjectCount());
	    }
	}
	



