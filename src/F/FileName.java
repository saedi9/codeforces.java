package F;

import java.util.Scanner;

public class FileName {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int counter=0,l=0;
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='x'){ l++;}
            else{l=0;}
            if(l>2){counter++;}
        }
        System.out.println(counter);
    }
}
