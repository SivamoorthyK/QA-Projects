package basicCodes;

public class SwapTwoSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value1= "J Justin";
		String value2= "Jeneefa";
		
		String concat= value1+value2;
		
		String new1=concat.substring(value1.length(),concat.length());
		String new2S= concat.replace(new1, "");
		
		System.out.println(new1 +" "+new2S);
		
		
	}

}
