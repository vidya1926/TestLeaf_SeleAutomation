package week1.day2;

public class SumOfDigitsFromString {

	private static char[] charArray;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Tes12Le79af65";
		int sum = '0';
		text.replaceAll("[^0-9]","");
		char[] charArray2 = text.toCharArray();
		for (int i = 0; i < charArray2.length; i++) {
		sum = sum + Character.getNumericValue(charArray2[i]);	
		}
		System.out.println(sum);
	}

}
		  String text1 = "Tes12Le79af65"; 
		  int sum1= '0';
		  text1.replaceAll("[^0-9]","");
		  char[] charArray2 = text1.toCharArray(); 
		  for (int i = 0; i < charArray2.length-1; i++) 
		  { 
			if(Character.isDigit(ch[i])) {
			  sum1 = sum1 + Character.getNumericValue(charArray2[i]); 
		  } 
		  }
		  System.out.println(sum);
		  }
