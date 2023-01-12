package week1.day2;

import com.beust.jcommander.converters.CommaParameterSplitter;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String input="I am a software tester";//3 0 1 2 olleh
String[] split = input.split(" ");

for (int i = 0; i < split.length; i++) {
    //System.out.println(split[i]);
    if(i%2==0) {
        
        System.out.print(split[i]);
        
        System.out.print(" ");
    }
    else {
        
        char[] charArray = split[i].toCharArray();
        
        for (int j =charArray .length-1; j>=0 ; j--) {
            
            System.out.print(charArray[j]);
            
        }
        System.out.print(" ");
    }
        
    
    }
	}
}
