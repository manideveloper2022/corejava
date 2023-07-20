package pracfiles;

import java.util.HashMap;
import java.util.Map;

public class interview4 {
		 public static void main(String[] args) {

			 String input= "azhellokumarhowareyou";
			 
			 Map<String , Integer> map = new HashMap<>();
			 boolean hasAlphabet = true;
			 for(int i=0;i<input.length();i++) {
				 int ch = (int)input.charAt(i);
				 if(!(ch>=97 && ch<= 122)) {
					 System.out.println("Other characters found");
					 hasAlphabet = false;
					 break;
				 }
			 }
			 
			 if(hasAlphabet) {
				 System.out.println("input has only alphabets");
			 }
			 
			 }
}
