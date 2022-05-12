package loops;
import java.util.Scanner;
public class CheckArmstrongNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cpno=n;
		int ld;
		int an=0;
		while(n!=0)
		{
			ld = n%10;
			an=an+ld*ld*ld;
			n=n/10;
		}
		if(an==cpno)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}
}
