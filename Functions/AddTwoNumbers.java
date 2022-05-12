package Functions;
import java.util.*;
public class AddTwoNumbers {
	int addition(int a,int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		AddTwoNumbers ad = new AddTwoNumbers();
		System.out.println(ad.addition(num1, num2));
		
	}
}
