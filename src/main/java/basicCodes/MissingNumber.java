package basicCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5,6,8,10};
		
	List<Integer> numbers= new ArrayList<>();
	
		int first= arr[0];
		int num=arr[arr.length-1];
		
		for(int i=first; i<=num; i++) {
			
		numbers.add(i);
		
	}
		int arr2[]=numbers.stream().mapToInt(Integer::intValue).toArray();
       int j=0;
		for(int i=0; i <arr2.length; i++) {
			
			if(arr[j]!=arr2[i]) {
				System.out.println(arr2[i]);
			}else if(j<arr.length){
				j++;
			}
			
		}

		
		System.out.println(arr2.toString
				());
		
}
}
