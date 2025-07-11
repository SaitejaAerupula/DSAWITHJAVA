import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int a[]=new int[n];
        int os=0;
        int fs=0;
        for(int i=0;i<n;i++){
            a[i]=c.nextInt();
            os+=a[i];
            fs+=(9-a[i]);
        }
        int dif = Math.abs(os-fs);
        System.out.println(dif);
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}