package basicCodes;

public class FirstandLastPostion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int arr[]= {1,2,3,4,5,6,7,8,9,4,8,2,1};

	 int first=-1;
	 int last =-1;
	 int target = 7;
	 
	 for(int i=0; i <arr.length; i++) {
		 
		if(arr[i]==target) {
			if(first==-1) {
				first=i;
			}else {
				last=i;
			}
		}
	 }
	 if(first!=-1&& last !=-1) {
		System.out.println(first +" "+ last);
	 }else if(first!=-1) {
		 System.out.println("it occured only one time "+ first);
	 }
	 else {
		 System.out.println("There is no multiple accurance");
	 }
	}

}
