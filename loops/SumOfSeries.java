package loops;
// 1 + (1+2) +(1+2+3)..... +(1+2+3+4+..+n)
import java.util.Scanner;
public class SumOfSeries {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;int s;
		for(int i =1;i<=n;i++)
		{
			s=0;
			for(int j=1;j<=i;j++)
			{
				s=s+j;
				
			}
			System.out.println(s);
			sum=sum+s;
		}
		System.out.println(sum);
	}
}
