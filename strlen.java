package java_program;

public class strlen {
	

	public static void main(String[] args) {
		String str = "automatio ";
		int l=0;
		try {
			while(true) {
				str.charAt(l);
				l++;
			}
		}catch(StringIndexOutOfBoundsException e) {
		}
		System.out.println("hello" + l);
		}
		// TODO Auto-generated method stub

	}

