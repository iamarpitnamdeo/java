package Strings;
import java.util.*;
public class CheckStringAlphanumeric {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int flag=0;
		for(int i=0;i<s1.length();i++)
		{
			if(!((s1.charAt(i)>='a'&&s1.charAt(i)<='z')||(s1.charAt(i)>='A'&&s1.charAt(i)<='Z')||(s1.charAt(i)>='0')&& (s1.charAt(i)<='9')) )
			{
				flag =1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Not Alphanumeric");
		}
		else 
		{
			System.out.println("Alphanumeric");
		}
	}
}
