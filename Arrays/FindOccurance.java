package Arrays;
//program to find the occurance of a number in an array
import java.util.Scanner;
public class FindOccurance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the digit to check the occurance");
		int n=sc.nextInt();
		int counter =0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==n)
				counter++;
		}
		System.out.println("Occurance of "+n+" in array is "+counter);
	}
}
