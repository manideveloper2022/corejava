package pracfiles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class interview7 {
		 public static void main(String[] args) {
		      
			  String str = "aaabbdbbfbbd";
			  
		      Map<String,Integer> map = new LinkedHashMap<>();
		      
		      for(int i=0;i<str.length();i++) {
		    	  String ch= ""+str.charAt(i);
		    	  if(map.containsKey(ch)) {
		    		 map.put(ch, map.get(ch)+1); 
		    	  }else {
		    		  map.put(ch, 1);
		    	  }
		      }
		      
		      
		      Set<Entry<String, Integer>> entrySet = map.entrySet();
		      for(Entry<String, Integer> entry: entrySet) {
		    	  if(entry.getValue() ==1) {
		    		  System.out.println(entry.getKey());
		    		  break;
		    	  }
		      }
		 }
} 
