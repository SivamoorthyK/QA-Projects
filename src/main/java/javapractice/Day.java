package javapractice;

public enum Day {

	/** Emum represent of group of named constants in the programming language*/
	
	 Monday("monday"), TUSDAY("tuesday");

	private String value;
	Day(String string) {
		// TODO Auto-generated constructor stub
		this.value= string;
		
	}
	
	
	public String getValue() {
		
		return value;
	}

    
	
}
