package day1;
import java.util.Scanner;
class pri{
	private String name;
	private int age;
	
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	
	//setters method with parameters
	public void setage(int age) {
		this.age=age;
	}
	public void setname(String name) {
		this.name=name;
	}
}
public class Encap {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		pri c=new pri();
		System.out.println("enter the name");
        String n=sc.next();
		System.out.println("enter the age");
		int a=sc.nextInt();
		c.setname(n);
		c.setage(a);
		System.out.println("my name is "+c.getname()+" my age is "+c.getage());

		}

}
