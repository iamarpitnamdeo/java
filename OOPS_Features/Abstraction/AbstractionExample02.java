package OOPS_Features.Abstraction;
//program to show use of abstarct class with interface which help in not implementing all methods
interface A{
	void a();
	void b();
	void c();
	void d();
}
abstract class B implements A{
	public void d() {
		System.out.println("method d");
	}
}
class C extends B{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("method a");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("method b");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("method c");
	}
	
}
public class AbstractionExample02 {
	public static void main(String args[]) {
		A obj = new C();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
}
