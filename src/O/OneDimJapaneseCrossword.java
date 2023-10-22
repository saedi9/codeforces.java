package O;

import java.util.Scanner;
import java.util.Stack;

public class OneDimJapaneseCrossword {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int b=0,x=0;
        String res="";
        char[] s=sc.nextLine().toCharArray();
        for (int i = 0; i < n; i++) {
            while (i<n && s[i]!='W'){ b++;i++;}
            if(b!=0){res+=b+" ";x++;b=0;}
        }
        if(x!=0){
            System.out.println(x);
            System.out.println(res);
        }else System.out.println(0);
    }

}
