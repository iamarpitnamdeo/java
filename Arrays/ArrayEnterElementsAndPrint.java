package Arrays;
import java.util.Scanner;
public class ArrayEnterElementsAndPrint {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int[5];
		System.out.println("Enter Integers in the array");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int a:arr)
		{
			System.out.print(a);
		}
	}
}
