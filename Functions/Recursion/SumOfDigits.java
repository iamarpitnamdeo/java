package Functions.Recursion;
//program to find sum of digitis of a number
public class SumOfDigits {
	static int sumdigits(int n) {
		if(n==0)
			return 0; 
		return n%10+sumdigits(n/10);
	}
	public static void main(String args[]) {
		int n = 123;
		int v=sumdigits(546);
		System.out.println(v);
	}
}
