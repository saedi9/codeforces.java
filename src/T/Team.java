package T;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int res=0;
        for (int i = 0; i < n; i++) {
            String[] ans= sc.nextLine().split(" ");
            int tem=0;
            for (String s:ans) {
                if(s.equals("1"))tem++;
            }
            if(tem>1)res++;
        }
        System.out.println(res);
    }
}
