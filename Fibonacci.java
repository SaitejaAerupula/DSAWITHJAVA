package java_program;

public class Fibonacci {
	public static void main(String[]args) {
		int n=10;
		int a=1,b=1;
		System.out.println(a+" "+b+" ");
		for(int i=2;i<n;i++) {
			int c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
	}

}
