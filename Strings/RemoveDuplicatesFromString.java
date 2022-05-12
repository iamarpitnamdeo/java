package Strings;

public class RemoveDuplicatesFromString {
	public static void main(String args[]) {
		String s1 = "aabbcddczk";
		String s2 ="";
		char c1;
		int counter;
		for(int i=0;i<s1.length();i++)
		{
			c1=s1.charAt(i);
			counter=0;
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(j)==c1)
				{
					counter++;
				}
			}
			if(counter<2)
			{
				s2=s2+c1;
			}
		}
		System.out.println(s2);
	}
}
