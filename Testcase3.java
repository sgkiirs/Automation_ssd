package typecasting;

class Excel2
{
	void Logout()
	{
		System.out.println("This method is above upcasting so can be accessed");
	}
	
}
class Excel1 extends Excel2
{
	void Login()
	{
		System.out.println("This method can be accessed");
	}
	
}
public class Testcase3 extends Excel1
{
	
		void Auth()
		{
			System.out.println("This method can not be accessed");
		}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excel1 e1 = new Testcase3();
		e1.Login();
		e1.Logout();
		
		// downcasting problem 3 
		
		Testcase3 t3=(Testcase3)e1;
		t3.Auth();
		t3.Login();
		t3.Logout();
	}

}
