package T;

import java.util.Scanner;

public class TheDoors {
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine().trim());
        int[] doors=new int[2];
        int[] l=new int[n];
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            if(x==1){doors[x]++;l[i]=x;}
            else{doors[x]++;l[i]=x;}
        }
        for (int i = 0; i < n; i++) {
            if(l[i]==1){doors[1]--;}
            else{doors[0]--;}
            if(doors[1]==0||doors[0]==0) {System.out.println(i+1);break;}
        }
    }
}
