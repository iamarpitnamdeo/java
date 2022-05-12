package loops;
import java.util.Scanner;
public class Factorial {
	public static void main(String args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial =1;
		for(int i=number;i>=1;i++)
			factorial=factorial*i;
		System.out.println("5! is "+factorial);
	}
}
