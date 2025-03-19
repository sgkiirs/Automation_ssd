package typecasting;

public class primitive {

	public static void main(String[] args) {
		// Converting weight into double
		
		double wt= 53; // widening
		//implicit		
		System.out.println(wt);
		
		
		// Convert weight from double to int
		
		int weight= (int) 55.33;
		System.out.println(weight);
		
		// byte to short
		byte a1=20; // as byte can't store 200 in it so converting into short datatype
		short s1=a1;
		System.out.println(s1);
		
		

	}

}
