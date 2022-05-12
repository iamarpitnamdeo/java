package OOPS_Features.Abstraction;
interface Drawable{
	public void draw();
}
class Rectangle implements Drawable{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");
	}
	
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("Draw Circle");
	}
}

public class InterfaceExample01 {
	public static void main(String args[]) {
		Drawable ob = new Rectangle();
		ob.draw();
	}
}
