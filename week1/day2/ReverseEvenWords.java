package week1.day2;

import com.beust.jcommander.converters.CommaParameterSplitter;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Need to Check
		
  		String test = "I am a software tester";
  		String even = "";
  		String rev = "";
  		String[] split = test.split(" ");
  		for (int i = 1; i < split.length; i++) {
  			if(i%2 != 0) {
  			even = even + split[i];}
  						
		}

		for (int j = even.length()-1; j >=0; j--) {
			rev = rev+ even.charAt(j);
				
		}
		for (int k = 0; k < split.length; k++) {
			if (k%2==0) {System.out.print(split[k]+" ");}
			
		}
		
	}
		
}

String test = "I am a software tester";
  		String rev = "";
  		String[] split = test.split(" ");
  		for (int i = 0; i < split.length; i++) {
  			if(i%2 == 0) {
  				char[] charArray = split[i].toCharArray();
  				for (int j = charArray.length-1; j>=0; j--) {
  					System.out.print(charArray[j]);
									}
  				System.err.print( " ");
  				
  			}else {
  				System.out.print(split[i]);
  				
  			}
  			
  			}
  			}
