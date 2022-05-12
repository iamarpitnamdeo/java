package OOPS_Features.Polymorphism;
class RBI
{
	public int rateOfInterest() {
		return 0;
	}
}
class SBI extends RBI
{
	public int rateOfInterest() {
		return 8;
	}
}
class BOM extends RBI{
	public int rateOfInterest() {
		return 5;
	}
}
class UBI extends RBI{
	public int rateOfInterest() {
		return 6;
	}
}
public class MethodOverriding {
	public static void main(String args[]) {
		RBI obj1 = new SBI();
		System.out.println(obj1.rateOfInterest());
		RBI obj2 = new UBI();
		System.out.println(obj2.rateOfInterest());
	}
}
