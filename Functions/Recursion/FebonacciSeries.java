package Functions.Recursion;

public class FebonacciSeries {
	public int febonacci(int no)
	{
		if(no==1||no==2)
			return 1;
		return febonacci(no-1)+febonacci(no-2);
	}
	public static void main(String args[]) {
		FebonacciSeries f1 = new FebonacciSeries();
		int n=10;
		for(int i=1;i<=n;i++)
		{
			System.out.print(f1.febonacci(i)+" ");
		}
	}
}
