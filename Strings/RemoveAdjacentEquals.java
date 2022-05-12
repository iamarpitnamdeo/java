package Strings;
public class RemoveAdjacentEquals {
	public static void  main(String args[]) {
		String s1 ="aabbbccdab";
		String s2 = "";
		char prev = ' ';
		for(int i=0;i<s1.length();i++)
		{
			if(prev!=s1.charAt(i))
			{
				s2=s2+s1.charAt(i);
				prev=s1.charAt(i);
			}
		}
		/*char []ch1 = s1.toCharArray();
		char prev = ' ';
		for(int i=0;i<ch1.length;i++) {
			if(prev!=ch1[i])
			{
				s2=s2+ch1[i];
				prev = ch1[i];
			}
		}*/
		System.out.println(s2);
	}
}
