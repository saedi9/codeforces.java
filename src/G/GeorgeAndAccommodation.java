package G;

import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int res=0;
        for (int i = 0; i < n; i++) {
            int p=sc.nextInt(),q=sc.nextInt();
            if(q-p>1)res++;
        }
        System.out.println(res);
    }
}
