package javapractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class ArraysFun {

	public static void main(String[] args) {
		
		int  arr[]= {1,4,6,8,0,2};		
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	Random random= new Random();
	
	int[][] arr1= new int[3][4];
	int[][] arr2= {{1,2,3,4},{5,6,7,8},{2,4,6,8}};
	
	for(int i=0; i<3; i++) {
		
		for(int j=0; j<4; j++) {
	arr1[i][j]=random.nextInt(1, 10);
		}
	}
for(int i=0; i<3; i++) {
		
		for(int j=0; j<4; j++) {
	System.out.print(arr1[i][j]+" ");
		}
		System.out.println();
	}
System.out.println("****** MULTI *******");

int[][][] multi= {{{1,2,3,4},{5,6,7,8},{2,3,4,5}},{{0,9,8,7},{6,5,4,3},{1,2,3,4}}};
	

  for(int i=0; i<2; i++) {
	for(int j=0;j<3; j++) {
		for(int k=0; k<4;k++) {
			System.out.print(multi[i][j][k]+" ");
			
		}
		System.out.println();
	}
	System.out.println();
}
  sum(3);
  sum(3,5);
  sum(3,5,2);
  

	}
	
	 /** Varargs implementations . it is basically a array but using ... we implement
	   * we can only add last arg when we are adding multiple args
	   */
	
	public static void sum(int...num) {
		int sum=0;
		

for(int i=0; i<num.length; i++) {
	
	sum+=num[i];
}
System.out.println(sum);

	}
}
