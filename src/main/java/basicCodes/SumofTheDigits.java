package basicCodes;

import java.util.Scanner;

public class SumofTheDigits {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int value=sc.nextInt();
		sc.close();
		int a, sum=0;
		
		while(value!=0) {
			 a= value % 10;
			sum+=a;
			value= value/10;			
			
		}
		System.out.println(sum);
	}
}
