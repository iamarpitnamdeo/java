package Introduction;

public class SwapValues {
	public static void main(String args[])
	{
		int a=10,b=20;
		System.out.println("Before Swapping : a = "+a+"& b = "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping : a = "+a+"& b ="+b);
	}
}
