package Contitionals;
import java.util.Scanner;
public class CheckDivisibility {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		System.out.println("Enter number to check divisibility with");
		int b = sc.nextInt();
		if(a%b==0)
			System.out.println(a+" is completely divisible by "+b);
		else
			System.out.println(a+" is not completely divisible by "+b);
	}
}
