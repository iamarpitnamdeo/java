package Functions.Recursion;
import java.util.Scanner;
public class printFirstNnaturalnumbers {
	static void printRange(int range) {
		/*if(range>0)
		{
			printRange(range-1);
			System.out.println(range);
			
		}
		return;*/
		if(range==0)
		{
			System.out.println(range);
			return;
		}
		printRange(range-1);
		System.out.println(range);
	}
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		n=sc.nextInt();
		printRange(n);
	}
}
