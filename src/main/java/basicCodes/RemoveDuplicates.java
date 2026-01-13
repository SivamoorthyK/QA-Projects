package basicCodes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		 int arr[]= {2,4,5,6,0,2,1,6,4};
	
//	int j=0;
//	for (int i=0; i<arr.length; i++) {
//		if(arr[i]!=arr[j]) {
//			j++;
//			arr[j]= arr[i];
//			
//		}
//		
//	}
		 

        int[] arr1 = new int[arr.length];

        int k = 0; 

        for (int i = 0; i < arr.length; i++) {
            boolean seenBefore = false;     
            for (int j = 0; j < i; j++) {   
                if (arr[i] == arr[j]) {
                    seenBefore = true;
                    break;
                }
            }
            if (!seenBefore) {
                arr1[k++] = arr[i];
            }
        }

     
		 
		 Set<Integer> set= new LinkedHashSet<>();
		 for (int i : arr) {
			set.add(i);
		}
		 System.out.println(Arrays.toString(arr1));
	
	System.out.println(set);
	}
	

}
