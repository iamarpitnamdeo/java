package Strings;
import java.util.Scanner;
public class PrintEnteredString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = new String();
		s1=sc.nextLine();
		System.out.println("String you entered is :"+s1);
		System.out.println("Length of the entered strig is "+s1.length());
		
		/* using another string
		 * String s2="";
		for(int j=s1.length()-1;j>=0;j--) {
			s2=s2+s1.charAt(j);
		}
		System.out.println(s2);*/
		
		/*Reverse string using string builder
		 * 
		 * StringBuilder sb1 = new StringBuilder();
		sb1.append(s1);
		System.out.println("Reverse from string builder "+sb1.reverse());*/
		
	}
}
