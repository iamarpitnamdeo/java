package loops;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int ld = 0;
		int rev=0;
		while(num!=0)
		{
			ld=num%10;
			rev = rev*10+ld;
			num=num/10;
		}
		System.out.println(rev);
	}
}
