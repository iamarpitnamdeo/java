package loops;
// a spy number is a number whose sum and product of it's digit is equal 
import java.util.Scanner;
public class SpyNumber {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	int product=1;
	int ld;
	while(n!=0)
	{
		ld =n%10;
		sum=sum+ld;
		product =product*ld;
		n=n/10;
	}
	if(sum==product) {
		System.out.println("Spy Number");
	}
	else
	{
		System.out.println("Not a spy number");
	}
}
}
