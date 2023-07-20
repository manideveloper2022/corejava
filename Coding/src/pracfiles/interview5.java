package pracfiles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class interview5 {
		 public static void main(String[] args) {

			 String input= "abcdefabcda";
			 
			 Map<String , Integer> map = new LinkedHashMap<>();
			 for(int i=0;i<input.length();i++) {
				 String ch = ""+input.charAt(i);
				 if(map.containsKey(ch)) {
					 map.put(ch, map.get(ch)+1);
				 }else {
					 map.put(ch, 1);
				 }
			 }
			 
			 Set<Entry<String, Integer>> entrySet = map.entrySet();
			 for(Entry<String, Integer> entry : entrySet) {
				 System.out.println(entry.getKey() + "-  " + entry.getValue());
			 }
			 
			 }
}
