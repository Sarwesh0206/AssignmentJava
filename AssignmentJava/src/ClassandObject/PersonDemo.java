package ClassandObject;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner method to get inputs
   Scanner ob=new Scanner(System.in);
   String name;
   System.out.println("Enter Person Name:");
   name=ob.next();
   System.out.println("Enter Age:");
   int age=ob.nextInt();
   System.out.println("Enter Gender:");
   String gender=ob.next();
   System.out.println("Enter taxable income:");
   int income=ob.nextInt();
   //person class by using setter
   Person person=new Person();
   person.setName(name);
   person.setAge(age);
   person.setGender(gender);
   person.setIncome(income);
   //tostring() method
   System.out.println(person);
   TaxCalculation calc=new TaxCalculation();
   calc.calculateTax(person);
   System.out.println("After calculating tax:");
   System.out.println(person);
   ob.close();
   


	}

}
