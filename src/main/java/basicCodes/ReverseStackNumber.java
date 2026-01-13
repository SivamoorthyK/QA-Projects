package basicCodes;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStackNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack= new Stack<>();
		
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		while(num !=0) {
			int temp= num%10;
			stack.push(temp);
			num=num/10;
		}
		
		System.out.println(stack);
		int reverse=0;
		int i=1;
		while(!stack.isEmpty()) {
			reverse= reverse+(stack.peek()*i);
			stack.pop();
			i=i*10;
		}
		
		System.out.println(reverse);
	}

}
