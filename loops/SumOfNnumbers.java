package loops;
import java.util.Scanner;
public class SumOfNnumbers {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int n = sc.nextInt();
		/*int sum=0;
		for(int i=0;i<=n;i++)
			sum=sum+i;
		System.out.println(sum);*/
		System.out.println((n*(n+1))/2);
		sc.close();
	}
}
