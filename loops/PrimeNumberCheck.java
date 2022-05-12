package loops;
import java.util.Scanner;
public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check prime");
		int n = sc.nextInt();
		/*int counter =0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				counter=counter+1;
			}
		}
		if(counter==0)
		{
		System.out.println("Prime number");
		}
		else
		{
		System.out.println("Not a prime number");
		}*/
		int i;
		for(i=2;i<n/2;i++)
			if(n%i==0)
				break;
		if(i>n/2)
			System.out.println("Prime");
		else
			System.out.println("Non Prime");
	}

}
