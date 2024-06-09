// Usage of the marker interface
package MarkerInterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Student s=new Student(8527,"sarwesh",12000,"Java");
		if (s instanceof Registrable ) {
			System.out.println("Student is registered for the course");
		    
		}
		else
			System.out.println("Student is not registered for the course");
			

	}

}
