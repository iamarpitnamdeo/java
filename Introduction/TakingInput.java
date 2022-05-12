package Introduction;

import java.util.Scanner;

public class TakingInput {
	//runner 
	
	public static void main(String args[]) {
	//using standard output stream to take input
		Scanner scan = new Scanner(System.in);
	int a=scan.nextInt();
	System.out.println("You Entered "+a);
	scan.close();
}
}