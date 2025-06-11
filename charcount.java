package java_program;
import java.util.*;

public class charcount {
	public static void main(String[]args) {
		String s = "Saiteja";
		HashMap<Character,Integer>charCount=new HashMap<>();
		for(char ch :s.toCharArray()) {
			if(charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch)+1);
			}else {
				charCount.put(ch, 1);
			}
		}
		System.out.println(charCount);
		
	}

}
