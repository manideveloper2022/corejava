package Collections.arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * Write a Java Program count the no of occurence of words in given string using Java 8.
  
    Input String: "Welcome to the coding round Welcome to Altimetrik first level technical round"
    
    Output: [Welcome=2, to=2 ,the=1,coding=1,round=2,Altimetrik=1,first=1,level=1,technical=1]
 * 
 * @author MRNB
 *
 */
public class Ex1 {

	public static void main(String[] args) {
		String input ="Welcome to the coding round Welcome to Altimetrik first level technical round";
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		String[] spaceArray = input.split("\\s+");
		for(String str :spaceArray ) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}else {
				map.put(str, 1);
			}
		}
		
		for(Entry<String,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
