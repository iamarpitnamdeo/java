package Strings;
import java.util.Scanner;
public class ConvertStringCase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		StringBuffer sb = new StringBuffer(s1.length());
		char ch;
		for(int i=0;i<s1.length();i++)
		{
			ch = s1.charAt(i);
			if(Character.isUpperCase(ch))
			{
				ch=Character.toLowerCase(ch);
				sb.append(ch);
				continue;
			}
			if(Character.isLowerCase(ch))
			{
				ch=Character.toUpperCase(ch);
				sb.append(ch);
				continue;
			}
			
			
		}
		System.out.println(s1);
		System.out.println(sb);
	}
}
