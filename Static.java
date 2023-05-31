package day1;

public class Static {
	String name;
	int rollno;
	 static String clgname="cbit";
	
	Static(int rollno,String name){
		this.name=name;
		this.rollno=rollno;
		//this.clgname=clgname;
	}
	public static void change() {
       clgname="srit";
	}
	 
	//method
	public void display() {
		System.out.println("my name is "+name);
		System.out.println("my rollno is "+rollno);
		System.out.println("my clgname is "+clgname);
	}
	public static void main(String[] args) {
		Static sv=new Static(10,"kushi");
		Static sv1=new Static(20,"jahnavi");
		change();
		sv.display();
		System.out.println();
	  
		sv1.display();
	}
		
}
