package pracfiles;

import java.sql.Connection;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class interview {
		 public static void main(String[] args) {
		       String str = "Manikanta" ;
		       System.out.println( str.chars());
		       
		       System.out.println(  str.chars()
		       .mapToObj( ch -> ""+ (char)ch)
		       .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()  ) ));
		       
		       System.out.println( str.chars()
		       .mapToObj( ch -> ""+ (char)ch)
		       .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()  ) )
		       .entrySet().stream().filter( en -> en.getValue() == 1)
		       .map(e -> e.getKey()).findFirst().get());
		    }
}//id , name, salary , 
