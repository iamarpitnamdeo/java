package Functions.Recursion;

public class FindSuperDigit {
	private int superDigit(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		if(sum/10==0)
		{
			return sum;
		}
		else
		{
			return superDigit(sum);
		}
	}
	public static void main(String args[])
	{
		FindSuperDigit f1 = new FindSuperDigit();
		int number = 123344;
		System.out.println(f1.superDigit(number));
	}
}
