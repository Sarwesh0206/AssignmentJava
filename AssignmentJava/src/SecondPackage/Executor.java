package SecondPackage;

import PackageAccessModifier.Base;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Base b1=new Base();
     //private,default and protected members cnt access here
     b1.methodPublic();
     b1.varPublic=41;
     b1.methodPublic();
     
     
     
	}

}
