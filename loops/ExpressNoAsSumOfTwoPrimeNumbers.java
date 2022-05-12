package loops;
import java.util.*;
public class ExpressNoAsSumOfTwoPrimeNumbers {
	public static int isPrime(int n)
	{
		int flag=0;
		for(int j=2;j<n/2;j++)
		{
			if(n%j==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		return 1;
		else
		return 0;
			
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to express it as a sum of two prime numbers");
		int num = sc.nextInt();
		for(int i=2;i<num/2;i++)
		{
			if(isPrime(i) && isPrime(num-i))
			{
				System.out.println(i);
				System.out.println(num-i);
			}
		}
	}
	
}
