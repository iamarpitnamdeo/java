package Functions;

public class AreaOfcircle {
	float areaOfCircle(int radious)
	{
			float pi=(float) 3.14;
			return pi*radious*radious;
	}
	public static void main(String args[]) {
			int r=5;
			AreaOfcircle a1 = new AreaOfcircle();
			System.out.println(a1.areaOfCircle(r));
	}
}
