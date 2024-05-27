package Constructor;

public class Employee {
	private int eid;
	private String ename;
	public Employee() {
		this(100,"Sarwesh");
	}
	public Employee(int eid,String ename)
	{
		//this() calling default constructor
		this.eid=eid;
		this.ename=ename;
	}
	public int getSid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
}
