package Overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     RBI rbi;
  //Dynamic blinding which assigning child class obj to parent cls ref variable
     
     rbi =new RBI();
     System.out.println(rbi.getRateofInterest());
     
     
     rbi=new SBI();
     System.out.println(rbi.getRateofInterest());
     
     rbi=new ICICI();
     System.out.println(rbi.getRateofInterest());
     
     rbi=new HDFC();
     System.out.println(rbi.getRateofInterest());
     
     
		
		
	}

}
