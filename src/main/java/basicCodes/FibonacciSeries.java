package basicCodes;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		int series= scan.nextInt();
		
		int arr[] = new int[series];
		arr[0]=0;
		arr[1]=1;
		
		int a=0;
		int b=1;
		
		for(int i=2; i<series;i++) {
			
			arr[i]= arr[i-1]+arr[i-2];
			
		}
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<series-2;i++) {
		int temp =b;
		b=a+b;
		a=temp;
		
		System.out.println(b);
		}
		
	}

}
