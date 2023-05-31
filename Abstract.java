package day1;

class cbit{

	private String name="cbit";
	private int age=20;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}


}
public class Abstract {
public static void main(String[] args) {
	cbit c=new cbit();
	System.out.println(c.getName());
	System.out.println(c.getAge());
	c.setage(2);

	
} 
}
