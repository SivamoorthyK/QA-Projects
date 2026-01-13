package basicCodes;

public class LoopingWithoutLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
     number(i);
		
	}

	public static void number(int i) {
		
		System.out.println(i);
		if(i<100) {
			number(i+1);
		}
	}
}
