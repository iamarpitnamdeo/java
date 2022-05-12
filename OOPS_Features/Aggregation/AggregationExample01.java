package OOPS_Features.Aggregation;
class Address
{
	private int hno;
	private int pinCode;
	private String city;
	private String state;
	private String country;
	Address(int hno, int pinCode, String city,String state,String country){
		this.hno=hno;
		this.pinCode=pinCode;
		this.city=city;
		this.state=state;
		this.country=country;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", pinCode=" + pinCode + ", city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}
	public int getHno() {
		return hno;
	}
	
	public int getPinCode() {
		return pinCode;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	
}
class Student{
	private String name;
	private int rollNo;
	//creating has-a relationship with adress class
	 Address studentAddress;
	Student(String name,int rollNo,Address address){
		this.name=name;
		this.rollNo=rollNo;
	    studentAddress=address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", studentAddress=" + studentAddress + "]";
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	
}
public class AggregationExample01 {
	public static void main(String args[]) {
		Address obj = new Address(172, 482003,"jabalpur","MP", "INDIA");
		Student obj2=new Student("Arpit Namdeo", 22, obj);
		System.out.println(obj2);
		//System.out.println(obj);
		/*System.out.println(obj2.getRollNo());
		System.out.println(obj2.getName());
		System.out.println(obj2.studentAddress.getHno());
		System.out.println(obj2.studentAddress.getPinCode());
		System.out.println(obj2.studentAddress.getCity());
		System.out.println(obj2.studentAddress.getState());
		System.out.println(obj2.studentAddress.getCountry());*/
	}
}
