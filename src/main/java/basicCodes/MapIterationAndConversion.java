package basicCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MapIterationAndConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> places= new HashMap<>();
		
		places.put("India", "Salem");places.put("Italy", "COuntryside");
		places.put("Irac", "its");places.put("Ind", "don't know");
		
		Iterator<String> names= places.keySet().iterator();
		
		while(names.hasNext()) {
			String key= names.next();
			String value= places.get(key);
			System.out.println(key +"  "+ value);
			
		}
		
		List<String> name= new ArrayList<>(places.keySet());
			
		for (String string : name) {
			System.out.println(string);
		}
		
		List<String> name2= new ArrayList<>(places.values());
		for (String string : name2) {
			System.out.println(string);
		}
	}

}
