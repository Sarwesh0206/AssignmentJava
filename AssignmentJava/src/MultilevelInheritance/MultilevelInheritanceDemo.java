package MultilevelInheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MultilevelInheritanceDemo {
	public static void main(String[] args) {

		Person p1 = new Person("Sarwesh", 7823534676l, new Date(2006, 6, 2));
		System.out.println(p1);

		p1 = new Employee("Aaryan", 93448746034l, new Date(2005, 01, 012), "Sales", 45000);
		System.out.println(p1);

		p1 = new LevelOneEmployee("Madhu", 9880807227l, new Date(1988, 15, 02), "Account", 85000, 200,
				"Signing Authority");
		System.out.println(p1);
	}

}
