package basicCodes;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value="I am Janeefa";
		String rev="";
		int num= value.length()-1;
		char arr[]= value.toCharArray();
		
		for(int i=num ; num>=0;num--) {
			rev+=arr[num];
			
		}
		System.out.println("The string usual method - "+ rev);
		
		StringBuilder stringvalue= new StringBuilder(value);
		System.out.println("The string builder method - "+stringvalue.reverse());
		
		StringBuffer stringvalue1= new StringBuffer(value);
		System.out.println("The string buffer method - "+stringvalue1.reverse());
	
		for(int j=num; num/2 >j;j--) {
			
			char temp= arr[j];
			arr[j]= arr[num];
			arr[num]=temp;
		}
	for (char c : arr) {
		System.out.print(c);
	}
		
	}
	

	
}
