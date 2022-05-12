package Contitionals;
import java.util.Scanner;
public class CheckEvenOdd {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a%2==0)
			System.out.println("Even number");
		else if(a%2!=0)
			System.out.println("Odd number");
		else 
			System.out.println("NOT a number");
				
	}
}

