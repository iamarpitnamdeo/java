package static_keyword;
public class SimpleStaticExample {
	static int num;
	static String str;
	static {
		num=37;
		str="Arpit Ji";
	}
	static void myMethod() {
		num=45;
		System.out.println(num+" "+str);
	}
	public static void main(String args[]) {
		
		System.out.println(num);
		System.out.println(str);
		myMethod();
	}
}
