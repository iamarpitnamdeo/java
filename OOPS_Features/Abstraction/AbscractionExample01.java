package OOPS_Features.Abstraction;
//example of abstract class that have abstract and non abstract method
abstract class Bike{
	Bike(){
		System.out.println("Bike is created");
	}
	public void gearchange() {
		System.out.println("Gear Changed");
	}
	abstract void run();
}
class Honda extends Bike {

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Running safely");
	}
	
}
public class AbscractionExample01 {
	public static void main(String args[]) {
		Bike obj = new Honda();
		obj.run();
		obj.gearchange();
	}
}
