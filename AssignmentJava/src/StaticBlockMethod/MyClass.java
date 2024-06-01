package StaticBlockMethod;

public class MyClass {
     private int section;//nonstatic
     private static int srNo;//static
     //static block
     
     static
     {
    	 System.out.println("------Within Static Block------");
    	 srNo=1000;
    	 
     }
     //default Constructor
     MyClass()
     {
      System.out.println("--------Within Default Constructor-----");
      srNo++;
      section++;
      
     }
     @Override
     public String toString() {
    	 return "MyClass [Serial No "+srNo+", Section="+section+"]";
    	 
     }
     //static method
     static void display() {
     //here we cant acces non static members
     System.out.println("Serial No'"+srNo);
     }
}
