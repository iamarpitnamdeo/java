package loops;
import java.util.Scanner;
public class CalculatePowerOfNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base value");
		int a = sc.nextInt();
		System.out.println("Enter exponent value");
		int y = sc.nextInt();
		int result=1;
		for(int i=1;i<=y;i++)
		{
			result = result*a;
		}
		System.out.println(y+" to the power "+a+" is "+result);
	}
}
