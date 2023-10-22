package T;

import java.util.Scanner;

public class TheTelephoneNum {
    public static void main(String[] st){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String num=sc.nextLine();
            for (int i = 0; i < n; i++) {
                if(n-i>=11 && num.charAt(i)=='8'){ System.out.println("YES"); break;}
                if(n-i<11){System.out.println("NO"); break;}
            }
        }
    }
}
