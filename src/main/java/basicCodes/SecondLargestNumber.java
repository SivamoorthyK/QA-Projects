package basicCodes;

public class SecondLargestNumber {
	
	
	public static void main(String[] args) {
	
		int[] arr= {2,8,5,4,0,8,7,6,2,1};
		
		
		for(int i =0; i< arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
			
		}
		for(int i=arr.length-2;i>0;i--) {
			if(arr[i]!=arr[arr.length-1]) {
				System.out.println(arr[i]);
				break;
			}
		}
		
	}

}
