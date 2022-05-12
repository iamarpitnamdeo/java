package OOPS_Features.constructors;

public class CopyConstructor {
	String web;
	CopyConstructor(String web)
	{
		this.web=web;
	}
	CopyConstructor(CopyConstructor ob)
	{
		web=ob.web;
	}
	void display() {
		System.out.println("WebSite : "+web);
	}
	public static void main(String args[])
	{
		CopyConstructor obj1 = new CopyConstructor("WWW.Careerpath.com");
		CopyConstructor obj2 = new CopyConstructor(obj1);
		obj1.display();
		obj2.display();
	}
}
