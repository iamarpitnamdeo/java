package Strings;
import java.util.Scanner;
import java.util.StringTokenizer;
public class CountWordsOfString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		//with split method 
		String[] words=s1.split("\s");
		System.out.println(words.length);
		//with StringTokenizer
		
		StringTokenizer st1 = new StringTokenizer(s1);
		System.out.println(st1.countTokens());
		/*int counter=0;
		//checking if the current index is character and the next index is space
		for(int i=0;i<s1.length()-1;i++)
		{
			if( (s1.charAt(i)>='a'&&s1.charAt(i)<='z')&&(s1.charAt(i+1)==' ')  )
			{
				counter+=1;
			}
		}
		System.out.println(counter+1);*/
	}
}
