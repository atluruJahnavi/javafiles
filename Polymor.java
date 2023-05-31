package day1;
import java.util.Scanner;
public class Polymor {
	public void over(String d) {
		System.out.println(d);
	}
	public void over(int a) {
		System.out.println(a);
	}
	public void over(int b,String c) {
		System.out.println("name is "+c+" age "+b);
	}
	public void over(String e,int f) {
		System.out.println("name is "+e+" age "+f);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				Polymor vr=new Polymor();
				vr.over(20);
				vr.over("cbit");
				vr.over("jaanu",20);
				vr.over(20,"sindhu");
	}


}
