package loops;
import java.util.Scanner;
public class StrongNumber {
	int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String args[])
	{
		StrongNumber obj = new StrongNumber();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int numcpy=num;
		int ld;
		int sum=0;
		while(num!=0)
		{
			ld=num%10;
			sum=sum+obj.fact(ld);
			num=num/10;
		}
		if(sum==numcpy)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a strong number");
		}
	}
}
