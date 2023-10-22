package C;

import java.util.Scanner;

public class Cards {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=0,z=0;
        int x=sc.nextInt();
        sc.nextLine();
        String l=sc.nextLine();
        for (int i = 0; i < x; i++) {
            if(l.charAt(i)=='n'){n++;}
            if(l.charAt(i)=='z'){z++;}
        }
        for (int i = 0; i < n; i++) {
            System.out.print("1 ");
        }
        for (int i = 0; i < z; i++) {
            System.out.println("0 ");
        }
    }
}
