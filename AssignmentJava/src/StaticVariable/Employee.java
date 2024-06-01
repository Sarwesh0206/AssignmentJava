package StaticVariable;

public class Employee {

	
	//Declare instance variable
	private String name;
	private int id;
	
	static String companyName="TNS";
	//declaring two parameters
	Employee(String name,int id){
		this.name=name;
		this.id=id;
		
	}
	@Override
	public String toString() {
		return "Employee [name=" +name+",id=" +id+",Company="+companyName+"]";
		
	}
}
