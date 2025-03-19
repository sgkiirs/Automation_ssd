package typecasting;


class Excelsheet
{
	void DataFetching()
	{
		System.out.println("1");
	}
}

public class Testcase1 extends Excelsheet
{	
	void LoginToLogout()
	{
		System.out.println("2");
	}

	public static void main(String[] args) {
		// upcasting - converting subclass object to superclass type
		
		Excelsheet e1 = new Testcase1();
		e1.DataFetching();
	 // we cant use child class methods
		
		// downcasting : need to write explicitly
		Testcase1 t1= (Testcase1)e1;
		t1.DataFetching();
		t1.LoginToLogout();
		
	}

}
