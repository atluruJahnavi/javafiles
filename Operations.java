package day1;

interface add{
	void avalue();
	void bvalue();
	
}

interface sub{
	void cvalue();
	void dvalue();
	
}

class info implements add,sub{

	@Override
	public void avalue() {
		// TODO Auto-generated method stub
		System.out.println( "a value is 10");
		
	}

	@Override
	public void bvalue() {
		// TODO Auto-generated method stub
		System.out.println("b vale is 20");
		
	}

	@Override
	public void cvalue() {
		// TODO Auto-generated method stub
		System.out.println("c value is 15");
		
	}

	@Override
	public void dvalue() {
		// TODO Auto-generated method stub
		System.out.println("d value is 25");
		
	}
	
	
}
public class Operations {
	public static void main(String[] args) {
		add ad=new info();
		ad.avalue();
		ad.bvalue();
		sub s=new info();
		s.cvalue();
		s.dvalue();
	}

}
