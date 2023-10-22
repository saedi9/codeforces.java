package B;

import java.util.Scanner;

public class BusToUdayland {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=0;
        n=sc.nextInt();
        sc.nextLine();
        String [][] sets=new String[n][2];
        boolean flag=true;
        for (int i = 0; i < n; i++) {
            String[] temp=sc.nextLine().split("\\|");
            if(flag){
                if(temp[0].equals("OO")){temp[0]="++";flag=false;}
                else if(temp[1].equals("OO")){temp[1]="++";flag=false;}
            }
            sets[i]=temp;
        }
        if(!flag){
            System.out.println("YES");
            for(String[] h: sets)System.out.println(h[0]+"|"+h[1]);
        }else System.out.println("NO");
    }
}
