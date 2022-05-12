package Strings;
import java.util.Scanner;
public class OccuranceOfCharacterInString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		char ch;
		int count=0;
		ch = sc.nextLine().charAt(0);
		for(int i=0;i<s1.length();i++) {
			if(ch==s1.charAt(i))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
