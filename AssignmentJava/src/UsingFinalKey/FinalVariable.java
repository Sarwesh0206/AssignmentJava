package UsingFinalKey;

public class FinalVariable {
	
	//final int x;
	final int x=100;
	//declaring static blank variable
    final static int Y;
    //initialize static final variable
    final static int Z=10;
    
    //instance method
    void change() {
    	x=30;
    	Y=200;
    	
    }
    @Override
    public String toString() {
    	return "Final variable[x="+ x +",Y="+ Y +"]";
    	
    }
    static {
    	Y=20;
    	Z=100;
    	System.out.println("Value of Y:"+Y);
    	
    	
    }
}
