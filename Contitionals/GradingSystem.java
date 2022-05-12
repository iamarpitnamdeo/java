package Contitionals;
import java.util.Scanner;
public class GradingSystem {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);//taking input from system.in
		System.out.println("Enter your grades");
		char c = scan.next().charAt(0);
		if(c=='a'||c=='A')
			System.out.println("Excellent");
		else if(c=='b'||c=='B')
			System.out.println("Good");
		else if(c=='c'||c=='C')
			System.out.println("Fair");
		else
			System.out.println("Poor");
	}
}

