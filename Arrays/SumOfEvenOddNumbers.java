package Arrays;
import java.util.Scanner;
public class SumOfEvenOddNumbers {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int arr[]=new int[10];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int evensum=0;
	int oddsum=0;
	for(int j=0;j<arr.length;j++)
	{
		if(arr[j]%2==0)
		{
			evensum=evensum+arr[j];
		}
		else
		{
			oddsum+=arr[j];
		}
	}
	System.out.println("Sum of even numbers "+evensum+"Sum of odd numbers"+
	oddsum);
}
}
