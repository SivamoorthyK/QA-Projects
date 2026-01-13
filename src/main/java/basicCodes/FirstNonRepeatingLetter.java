package basicCodes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatingLetter {

	public static void main(String[] args) {
		
		String name="SivawaVmoorthy K Sivamoorthy";
		
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		
		for (Character ch : name.toCharArray()) {
		map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for (Entry entry : map.entrySet()) {
			if(entry.getValue().equals(1)) {
				System.out.println(entry.getKey());
				break;
			}
			
		}
		
		
		for(int i=0; i<name.length(); i++) {
			int postion =1;
			for(int j=i+1;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					postion++;
					break;
				}else if(postion==1) {
					continue;
				}
				
			}
			if(postion==1) {
				System.out.println(name.charAt(i));
				break;
			}
			
		}
		
				}
	
}
