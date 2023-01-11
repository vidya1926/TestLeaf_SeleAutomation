package week1.day1;

import java.util.Iterator;

public class PrintFibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum = 0, secNum = 1, Sum = 0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=1; i<12; i++) {
			Sum = firstNum + secNum;
			firstNum= secNum;
			secNum = Sum;
			System.out.println(Sum);
					
		}
	}

}
