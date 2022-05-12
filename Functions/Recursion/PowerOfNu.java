package Functions.Recursion;

public class PowerOfNu {
	static int power(int x,int y)
	{
		if(y==0)
		{
			return 1;
		}
		return (x*power(x,y-1));
	}
	public static void main(String[] args)
	{
		int a=2,b=3;
		System.out.println(power(2,3));
	}
}
