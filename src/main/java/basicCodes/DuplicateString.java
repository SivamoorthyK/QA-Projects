package basicCodes;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateString {

static Scanner sc= new Scanner(System.in);
static String value= sc.nextLine();
static String[] arr=value.split(" ");

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		for (String string : arr) {
			if(map.containsKey(string)) {
				map.put(string, map.get(string)+1);
			}else {
				map.put(string, 1);
			}
		}
		
		for (Entry<String, Integer> string : map.entrySet()) {
			if(string.getValue()>1) {
				System.out.println(string.getKey() +" occured : "+ string.getValue());
			}
		}
		
	}
	
}
