package B;

import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[4];
        int tot=0;
        for (int i = 0; i < 4; i++) {
            a[i]=sc.nextInt();
        }
        sc.nextLine();
        String[] s=sc.nextLine().split("");
        for (int i = 0; i < s.length; i++) {
            tot+=a[Integer.parseInt(s[i])-1];
        }
        System.out.println(tot);
    }
}
