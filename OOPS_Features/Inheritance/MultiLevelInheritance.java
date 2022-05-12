package OOPS_Features.Inheritance;
class Animal
{
	void sound() {
		System.out.println("Animal Sound");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog Barks");
	}
}
class BabyDog extends Dog{
	void sleep() {
		System.out.println("Weep_Sleep");
	}
}
public class MultiLevelInheritance {
	public static void main(String args[]) {
		BabyDog obj = new BabyDog();
		obj.sound();
		obj.bark();
		obj.sleep();
	}
}
