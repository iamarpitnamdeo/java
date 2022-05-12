package OOPS_Features.constructors;

public class Constructor02 {
	int empId;
	String empName;
	public Constructor02(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	public void getInfo() {
		System.out.println("Employee ID is : "+empId+" Employee Name is : "+empName); 
		
	}
	public static void mainS(String args[])
	{
		Constructor02 obj1 = new Constructor02(001,"Tony Stark");
		Constructor02 obj2  = new Constructor02(002,"Captain America");
		obj1.getInfo();
		obj2.getInfo();
	}
}
