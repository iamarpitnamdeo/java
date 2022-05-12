package OOPS_Features.Abstraction;
interface one
{
	void method1();
}
interface two
{
	void method1();
	void method2();
}
class three implements one,two{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2 form B interface");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		//when there are two similar methods in two different interfaces then it is implemented only once 
		System.out.println("Method 1 ");
	}
	
}
public class InterfaceExample02 {
	public static void main(String args[]) {
		three th = new three();
		th.method1();
		th.method2();
	}
}
