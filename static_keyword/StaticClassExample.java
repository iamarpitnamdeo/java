package static_keyword;

public class StaticClassExample {
 private static String str = "Tony Stark";
 static class MyNestedClass{
	 public void disp() {
		 System.out.println(str);
	 }
 }
 public static void main(String args[]) {
	 StaticClassExample.MyNestedClass ob = new StaticClassExample.MyNestedClass();
	 ob.disp();
	 
 }
}
