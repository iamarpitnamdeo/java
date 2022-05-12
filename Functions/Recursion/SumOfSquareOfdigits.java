package Functions.Recursion;

public class SumOfSquareOfdigits {
	static int sumSqDig(int n)
	{
		int ld=n%10;
		if(n==0)
			return 0;
		return (ld*ld+sumSqDig(n/10));
	}
	public static void main(String args[])
	{
			int number = 1234;
			System.out.println(sumSqDig(number));
	}
}
