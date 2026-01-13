package basicCodes;

public class ConsicutiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,5,6,7,8,9,10,2,6,7,8,9,10,11,12};
		int current = 1;
		int max=1;
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]+1==arr[i+1]) {
				current++;
				
			}else {
				current=1;
			}
			
			if(current>max) {
				max= current;
			}
		}
			
		System.out.println(max);
		
	}

}
