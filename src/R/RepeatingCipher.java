package R;

import java.util.Scanner;

public class RepeatingCipher {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        char[] t=sc.nextLine().toCharArray();
        String s= "";
        int i=0,st=1;
        while (i<n){
            s+=t[i];
            i+=(st++);
        }
        System.out.println(s);
    }
}
