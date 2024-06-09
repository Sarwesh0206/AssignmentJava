package SingleInheritance;

public class Student extends Citizen {
	private int rollNo;
	private String collegename;

	 public Student() {
		 super();
		 
	 }
	 
	 public Student(String name,String aadharNo,String address,long phno,int rollNo,String collegeName) {
		 super(name,aadharNo,address,phno);
		 this.rollNo=rollNo;
		 this.collegename=collegeName;
	 }

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegename=" + collegename + "]";
	}
	
}
