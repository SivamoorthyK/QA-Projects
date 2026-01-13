package basicCodes;

public class StringGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value= "a3b5c6";
		
		for(int i=0; i<value.length(); i++) {
			if(Character.isAlphabetic(value.charAt(i))) {
				System.out.println(value.charAt(i));
			}else {
				
				for(int j=1; j<Character.getNumericValue(value.charAt(i));j++){
					System.out.println(value.charAt(i-1));
				}
			}
			
		}
		
	}

}
