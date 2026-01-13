package basicCodes;

import java.util.Scanner;

public class CountOfCapitalwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String value= sc.nextLine();
		sc.close();
		
		char[] arr= value.toCharArray();
		int count=0;
		
		for (char c : arr) {
			
			if(c>='A' && c <='Z') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
