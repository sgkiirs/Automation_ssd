package typecasting;


class Excelsheet2
{
	void Logout()
	{
		System.out.println("This method can be accessed");
	}
	
}
class Excelsheet1 extends Excelsheet2
{
	void Login()
	{
		System.out.println("This method can be accessed");
	}
	
}

public class Testcase2 extends Excelsheet1{
	
	
		void Auth()
		{
			System.out.println("This method can be accessed");
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excelsheet2 e2 = new Testcase2();
		e2.Logout();
		
		// downcasting
		Testcase2 t3= (Testcase2)e2;
		t3.Login();
		t3.Logout();
		t3.Auth();
		
	}

}
