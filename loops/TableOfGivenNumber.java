package loops;
import java.util.Scanner;
public class TableOfGivenNumber {
	public static void main(String args[])
	{
		//long start = System.currentTimeMillis();	    
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER FOR TABLE");
		int num = sc.nextInt();
		for(int i = 1 ;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+i*num);
		}
//		long end = System.currentTimeMillis();
//		System.out.println((end - start) + " ms");
		sc.close();
	}
}
