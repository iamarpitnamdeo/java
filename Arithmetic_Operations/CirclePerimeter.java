package Arithmetic_Operations;
import java.util.Scanner;
public class CirclePerimeter {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radious");
		int r = sc.nextInt();
		double pi=3.14;
		System.out.println("Perimeter of circlei is : "+2*pi*r);
		
	}
}
