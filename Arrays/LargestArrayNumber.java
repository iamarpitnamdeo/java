package Arrays;
import java.util.Scanner;
public class LargestArrayNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		int smallest =arr[0];
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]>largest)
				largest = arr[j];
			if(arr[j]<smallest)
				smallest =arr[j];
		}
		System.out.println("Largest element of the array is "+largest+
				"and smallest is "+smallest);
	}
}
