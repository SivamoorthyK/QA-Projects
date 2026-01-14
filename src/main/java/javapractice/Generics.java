package javapractice;

import java.util.ArrayList;
import java.util.List;

public class Generics<T> {
/** GEneric is nothing but handling the instances with the Type
 * ex. ArrayList list = new ArrayLis(); non generic
 * ArrayList<String> list = new ArrayList<String>(); Generic.
 *  class, instance , methods are available
 *  E elements
 *  K keys
 *  V values
 *  N numbers
 *  T for generics
 *  S U V
 */
	
	private  T siva;
	
	

	
	public  Generics(T var) {
		this.siva= var;
		System.out.println(this.siva);
	}
	
	//Generics allow you to pass a data type as parameter 
	// in this below <T> implement allow us send any type to this function
	// T in the arguments will send the corresponding data type ther
	public static <T> void function(T var) {
		System.out.println(var);
		
	}
	
	
	/** Generic wildcards are used by ? 
	 * it is basically to allow any unknown time.
	 * we can bounding it two way upper bounding and lower,
	 * upper -> it can be any of the child of given class
	 * lower -> it can be any of the super class of given class
	 * @return 
	 */
	
	public  static void print(List<? extends Number> number) {
		//Upper bound
		for (Number number2 : number) {
			
			System.out.println(number2);


		}
	}
	public  static void print1(List<? super Integer > num) {
		//Lower bound
		for (Object number2 : num) {
			
			System.out.println(number2.toString());
			
			
		}
	}
	
	
	public static void main(String[] args) {
		
		new Generics(100);
		function(1);
		function("Siva");
		function('c');
		new Generics("moorthy");
		ArrayList<Double> d= new ArrayList<>();
		d.add(0.123);
		ArrayList<Integer> I= new ArrayList<>();
		I.add(1);
		ArrayList<String> S= new ArrayList<>();
		S.add("Siva");
		print(d);
		print(I);
		
		
		print1(I);
		
		
		
	}
	
	
}
