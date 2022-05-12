package Arrays;
import java.util.*;
public class CountPositiveAndNegativeElementsOfArray {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[10];
	System.out.println("Enter Integers");
	for(int i=0;i<10;i++)
	{
		arr[i]=sc.nextInt();
	}
	int positive=0;
	int negative=0;
	for(int j=0;j<10;j++)
	{
		if(arr[j]>=0)
			positive++;
		else
			negative++;
	}
	System.out.println("Positive Integers "+positive+
			" Negative Integers"+negative);
}
}
