package javapractice;

public class Strings {

	/** String Comparisions*/
	
	public static void main(String[] args) {
		intern();
		function();
		stringBuilder();
		stringBuffer();
		
	}
	
	public static void intern() {
		String a= "Siva";
		String b= "Siva";
		String c= new String("Siva");
		String d= new String("Siva");
		
		System.out.println((a==b)? true: false);
		System.out.println((a==c)? true: false);
		System.out.println((c==d)? true: false);
		System.out.println((a.equals(c))? true: false);
		
		c= c.intern();
		System.out.println((a.equals(c))? true: false);
		
	}
	
	public static void function() {
		String str1= "Siva";
		String str2= "Moorthy";
		
		System.out.println(str1.concat(str2));
		
		System.out.println(str2.substring(0,3));
		System.out.println(str1.replace("iva", "hiva"));
		System.out.println(str1.replaceAll(str1, "Sathya"));
		System.out.println(str1.trim());
		
		String[] name=str2.split("r");
		for (String string : name) {
			System.out.println(string);
		}
		
	}
	
	public static void stringBuilder() {
		StringBuilder sb= new StringBuilder("Siva");
		sb.append("Moorthy");
		System.out.println(sb.replace(3, 4, "a "));
		System.out.println(sb.insert(12, " K"));
		
		
		
	}
	
	public static void stringBuffer() {
		StringBuilder sb= new StringBuilder("Siva");
		sb.append("Moorthy");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.delete(0, 10));
		System.out.println(sb);
	}
	
	
}

