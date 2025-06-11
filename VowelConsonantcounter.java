package java_program;

public class VowelConsonantcounter {
	public static void main(String[]args) {
		String a = "SaitejaAerupula";
		a = a.toLowerCase();
		int vowels=0,consonants=0;
		for(int i=0;i<a.length();i++) {
			char ch =a.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowels++;
				
			}else {
				consonants++;
			}
			
			}
		}System.out.println("v"+vowels +",con"+consonants);
	}
}
	


