package Functions.Recursion;
//recursion program to find sum of cubes of first n natural numbers
public class SumOfCubesOfFirstNnaturalNu {
	static int sumOfCubes(int range)
	{
		if(range==1)
			return 1;
		return (range*range*range + sumOfCubes(range-1));
	}
	public static void main(String args[]) {
		int limit = 3;
		System.out.println(sumOfCubes(limit));
	}
}
