package basicCodes;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int value=sc.nextInt();
		sc.close();
		int digit; double total = 0;
		
		while(value!=0) {
			digit= value%10; 

            total+=(digit*digit*digit); 
			value=value/10;
		}
		System.out.println(total);
		
	}
}
