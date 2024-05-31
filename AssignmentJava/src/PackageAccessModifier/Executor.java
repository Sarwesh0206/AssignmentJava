package PackageAccessModifier;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		//accessing same Package class
		
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		b1.varDefault=11;
		b1.methodDefault();
		//private cannot be accesible

		b1.varProtected=31;
		b1.methodDefault();
		
		b1.varPublic=41;
		b1.methodPublic();
		
		
		System.out.println(b1 instanceof Base);//returns true
		
	}

}
