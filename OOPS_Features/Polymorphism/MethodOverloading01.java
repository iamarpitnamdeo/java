package OOPS_Features.Polymorphism;

public class MethodOverloading01 {
	static int add(int a, int b)
	{
		return a+b;
	}
	static int add(int a, int b , int c)
	{
		return a+b+c;
	}
	static int add(double a, int b)
	{
		return (int) (a+b);
	}
	public static void main(String args[]) {
		System.out.println(add(12,24));
		System.out.println(add(12,2,4));
		System.out.println(add(18.45,12));
	}
}
