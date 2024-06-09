package FunctionalInterface;

abstract class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       EmployeeClass e=new EmployeeClass();
       System.out.println(e.Employee());
       
       //lamda expression
       EmployeeInterface e1 =()->{return "Good morning coders";};
       System.out.println(e1.Employee());
       
       
       
       
	}

}
