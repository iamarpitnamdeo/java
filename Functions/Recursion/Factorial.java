package Functions.Recursion;

public class Factorial {
	public int fact(int n)
	{
		if(n==0)
			return 1;
		return (n*fact(n-1));
	}
	public static void main(String args[]) {
		int number = 6;
		Factorial f1 = new Factorial();
		System.out.println(f1.fact(number));
	}
}
