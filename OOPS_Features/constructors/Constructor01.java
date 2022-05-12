package OOPS_Features.constructors;

public class Constructor01 {
	
	String text;
	public Constructor01(){
		this.text="constructor reference object | demonstration of default constructor";
	}
	
	public static void main(String args[]) {
		Constructor01 obj = new Constructor01();
		System.out.println(obj.text);
	}
}
