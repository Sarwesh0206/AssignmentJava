package UsingFinalKey;

final class FinalClass{
	void show() {
		System.out.println("Final class cannot be inherited");
		
	}
}
//here cannot create child class from final class
class FinalChildClass extends FinalClass{
	
}




public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass f1=new FinalClass();
		f1.show();
		
		
		

	}

}
