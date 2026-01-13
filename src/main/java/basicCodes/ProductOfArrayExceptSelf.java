package basicCodes;

public class ProductOfArrayExceptSelf {

	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		
		int prefix[]= new int[arr.length];
		int sufix[]= new int[arr.length];
		
		prefix[0]=1;
		sufix[arr.length-1]=1;		
		for(int i=1;i<arr.length;i++) {
			prefix[i]=arr[i-1]*prefix[i-1];	
		}
		
		for(int i=arr.length-2;i>=0;i--) {
			sufix[i]=arr[i+1]*sufix[i+1];	
		}
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=prefix[i]*sufix[i];
			System.out.println(arr[i]);
		}
	}
}
