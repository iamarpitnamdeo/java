package loops;
import java.util.Scanner;
public class PrintAllAlphabetsInUpperCase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		/*
		 * char c ='A'; for(int i=0;i<26;i++) { System.out.println(c); c++; }
		 */
		String s1= sc.nextLine();
		String s2 = s1.toUpperCase();
		System.out.println(s2);
	}
}
