package PackageAccessModifier;

public class Base {
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	
	void methodDefault()
	{
		System.out.println("Default access Base Class");
		System.out.println("Default variable:"+varDefault);
		
	}
 public void methodPublic()
 {
	 System.out.println("Public access Base Class");
	 System.out.println("Public variable:"+varPublic);
 }
 private void methodPrivate()
 {
	 System.out.println("Private access Base Class");
	 System.out.println("Private Variable:"+varPrivate);
	 
 }
 protected void methodProtected() {
	 System.out.println("Protected access base class");
	 System.out.println("Protected variable:"+varProtected);
 }
}
