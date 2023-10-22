package E;

import java.util.Scanner;

public class EvenSubstrings {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String st=sc.nextLine();
        int sum=0;
        for (int i = 0; i < n; i++) {
            if((st.charAt(i)-'0')%2==0){sum+=(i+1);}
        }
        System.out.println(sum);
    }
}
