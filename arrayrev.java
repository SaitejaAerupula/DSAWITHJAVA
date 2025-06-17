package java_program;

import java.util.Arrays;

public class arrayrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array = {1,2,3,7,5,7};
System.out.println("ORIGINAL" + Arrays.toString(array));
int s  =  0;
int e = array.length-1;
while (s<e) {
	int temp = array[s];
	array[s]=array[e];
	array[e]=temp;
	s++;
	e--;
	
}
System.out.println("reveresds"+Arrays.toString(array));
	}

}
