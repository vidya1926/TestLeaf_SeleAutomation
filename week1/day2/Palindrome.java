package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "madam";
		String rev = "";
		int length = value.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+value.charAt(i);
		}
				if(value.equals(rev))System.out.println("Yes! Palindrome");
				else System.out.println("Not Palindrome");
	}

}
