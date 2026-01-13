package basicCodes;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountCharacter {

	public static void main(String[] args) {
		
		String name="sivamoorthy";
		
		HashMap<Character, Integer> map= new HashMap<>();
		HashMap<Character, Integer> map1= new HashMap<>();
		for (char c : name.toCharArray()) {	
			map.put(c, map.getOrDefault(c,0)+1);// easy method
			
			if(map1.containsKey(c)) { // usual method
				map1.put(c, map1.get(c)+1);
			}else {
				map1.put(c, 1);
			}
		}
		 
		
		
		
	for(Entry<Character, Integer> e: map.entrySet()) {
		System.out.println(e.getKey()+":"+e.getValue());
	}
	System.out.println("-------------------------------------");
	for(Entry<Character, Integer> e: map1.entrySet()) {
		System.out.println(e.getKey()+":"+e.getValue());
	}
	System.out.println("-------------------------------------");
	if(map.equals(map1)) {
		System.out.println("both are equal");
	}
}
}
