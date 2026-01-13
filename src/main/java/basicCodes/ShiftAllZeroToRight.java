package basicCodes;

public class ShiftAllZeroToRight {

	
	
	public static void main(String[] args) {
		
		int arr[]= {0,1,2,0,3,4,0,5,0,0,6,0,0,1,1,1,0,7};
		int arr1[]= new int[arr.length];
	int count=0;
	int numOf=0;
	int n= arr1.length-1;
		for (int i : arr) {
			
			if(i!=1) {
				arr1[count]=i;
				count++;
			}else {
				numOf++;
			}
			
		}
		while(numOf!=0) {
			arr1[n]= 1;
			n--;
			numOf--;
		}
		
		for (int i : arr1) {
			System.out.print(i);
		}
	}
	
}
