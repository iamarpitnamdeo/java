package Arithmetic_Operations;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);//using system.in for input
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+b);
		sc.close();
	}
}
