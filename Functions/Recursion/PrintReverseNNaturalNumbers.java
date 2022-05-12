package Functions.Recursion;

public class PrintReverseNNaturalNumbers {
	public void printno(int n)
	{
		if(n==0)
		{
			System.out.println(0);
			return;
		}
		System.out.println(n);
		printno(n-1);
	}
	public static void main(String args[]) {
		PrintReverseNNaturalNumbers p1 =
				new PrintReverseNNaturalNumbers();
		int range=10;
		p1.printno(range);
	}
}
