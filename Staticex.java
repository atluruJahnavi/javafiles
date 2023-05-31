package day1;

public class Staticex {
	String name;
	int rollno;
	String clgname="cbit";
	
	Staticex(int rollno,String name,String clgname){
		this.name=name;
		this.rollno=rollno;
		this.clgname=clgname;
	}
	 
	//method
	public void display() {
		System.out.println("my name is "+name);
		System.out.println("my rollno is "+rollno);
		System.out.println("my clgname is "+clgname);
	}
	public static void main(String[] args) {
		Staticex sv=new Staticex(10,"kushi","cbit");
		sv.display();
		
		
		
	}

}
