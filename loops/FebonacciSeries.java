package loops;

public class FebonacciSeries {
	public static void main(String args[])
	{
		int a=1;
		int b=2;
		int c;
		System.out.print(a+" ");
		System.out.print(b);
		for(int i=0;i<10;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;b=c;
		}
	}
}
