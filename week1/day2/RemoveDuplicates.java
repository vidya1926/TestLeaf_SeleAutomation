package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] split = value.split(" ");
		for (int i = 0; i <= split.length; i++) {
			for (int j = i+1; j < split.length-1; j++) {
				if(split[i].equalsIgnoreCase(split[j])) {
					split[i] = "";
					count++;
				
			}
			
		}}
		
		if(count>1) {
			for (int k = 0; k < split.length; k++) {
				System.out.print(split[k]);
			}
		}
	}

}
