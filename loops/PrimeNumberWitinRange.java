package loops;
import java.util.Scanner;
public class PrimeNumberWitinRange {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the range to print the prime numbers");
	int range = sc.nextInt();//entering the range till where to print the prime numbers
	int currentNo;
	int flag=0;
	for(int i=1;i<range;i++)//using for loop to iterate over the code
	{	
		currentNo=i;
		{
			for(int j=2;j<currentNo;j++)
			{
				if(currentNo%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(currentNo);
			}
			flag=0;	
		}
	}
}
}
