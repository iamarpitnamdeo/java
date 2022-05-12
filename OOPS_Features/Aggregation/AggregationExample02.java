package OOPS_Features.Aggregation;
class Operation{
	public int square(int no)
	{
		return no*no;
	}
}
class circle{
	Operation op;
	double pi=3.14;
	
	double areaCircle(int radious) {
		op = new Operation();
		return pi*op.square(radious);
	}
}
public class AggregationExample02 {
	public static void main(String args[])
	{
		circle c=new circle();  
		   double result=c.areaCircle(5);  
		   System.out.println(result);  
	}
}
