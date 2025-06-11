package java_program;

public class Smallest {
	public static void main(String[]args) {
		int [] n = {10,2,3,4,5};
		int min = n[0];
		for(int i=1;i<n.length;i++) {
			if(n[i]<min) {
				min=n[i];
				
			}
		}
		System.out.println("small"+min);
		
	}

}
