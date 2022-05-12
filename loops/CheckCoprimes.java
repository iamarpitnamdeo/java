package loops;
import java.util.Scanner;

//coprimes is the pair of numbers which do not have any common factor other than 1
public class CheckCoprimes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		int flag=0;
		int smaller = (a>b)?a:b;
		for(int i=2;i<=smaller;i++)
		{
			if(a%i==0&&b%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Coprimes");
		}
		else {
			System.out.println("Non Coprimes");
		}
	}
}
