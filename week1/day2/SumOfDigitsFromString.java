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
