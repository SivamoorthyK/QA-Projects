package basicCodes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int value=sc.nextInt();
		sc.close();
		int prime=value;
		boolean flag=false;
		if(value<=1) {
			System.out.println("Not a prime Number");
		}
		else {
			for(int i=2; i<prime;i++)
			{
				if(prime%i==0) {
					System.out.println("not");
					flag = true;
					break;
				}	
			}
			if(!flag) {
				System.out.println("prime");
			}
			
			
			
			
			
		}
	}
}
