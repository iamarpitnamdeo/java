package Arithmetic_Operations;
import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int radious=sc.nextInt();
		final double pi=3.14;
		System.out.println("Area of circle = "+ pi*radious*radious);
	}
}
