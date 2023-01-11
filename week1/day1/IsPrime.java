package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 7;
		boolean value = true;
		for(int i = 2; i < n; i++) {if(n%i == 0)
		{System.out.println(n + "is not prime");
		value = false;
		break;
							}
		 
		}
		if(value == true)
		 System.out.println(n + "is prime");				
		
		
	}
}