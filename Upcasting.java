package typecasting;


class Upcasting3{
	
	void upcast3()
	{
		System.out.println("3. This method is above upcasting");
		
	}
}
class Upcasting2 extends Upcasting3{
	void upcast2()
	{
		System.out.println("2.This upcasting method can be accessed");
		
	}
}

class Upcasting1 extends Upcasting2{
	void upcast1()
	{
		System.out.println("1. This method cant be accessed");
		
	}
}
public class Upcasting extends Upcasting1{
	void upcast()
	{
		System.out.println("4. This method is child class");
		
	}

	public static void main(String[] args) {
		
		Upcasting2 u1= new Upcasting1();

		u1.upcast2();
		u1.upcast3();

		Upcasting1 u = (Upcasting1) u1;
		u.upcast1();
		u.upcast2();
		u.upcast3();
		
	}

}
