package typecasting;

class casting3
{
	void cast3()
	{
		System.out.println("3. This method is above upcasting so can be accessed");
	}
}
class casting2 extends casting3
{
	void cast2()
	{
		System.out.println("2.This method is upcasted so can be accessed. ");
	}
}
class casting1 extends casting2
{
	void cast1()
	{
		System.out.println("1. This method cant be accessed.");
	}
}


public class Casting extends casting1{
	
		void cast4()
		{
			System.out.println("4. This method cant be accessed.");
		}


	public static void main(String[] args) {
		
		casting2 c2 = new casting1();
		c2.cast3();
		c2.cast2();
		
		// downcasting without upcasting
		//first need to upcast the required method
		
		casting1 c = new Casting(); // upcasting from Casting to casting1
		Casting cc= (Casting)c;
		cc.cast1();
		cc.cast2();
		cc.cast3();
		cc.cast4();
		
		
		
		
		
	}
	

}
