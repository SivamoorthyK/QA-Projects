package basicCodes;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		int num=arr.length/2;
		
		
		for(int i=arr.length-1; i>=num;i--) {
			int j=arr.length-1-i;
			
			arr[i]=arr[i]+arr[j];
			arr[j]= arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
