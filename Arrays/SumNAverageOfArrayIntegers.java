package Arrays;
import java.util.Scanner;
public class SumNAverageOfArrayIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		double sum=0;
		double avg=0;
		for(int j=0;j<a.length;j++)
		{
			sum+=a[j];
		}
		avg=sum/a.length;
		System.out.println("Sum : "+sum+" Average : "+avg);
	}

}
