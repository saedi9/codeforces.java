package B;

import java.util.Scanner;

public class BetweenTheOffice {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        char[] cities=sc.nextLine().toCharArray();
        int FS=0,SF=0;
        for (int i=1;i<cities.length;i++){
            if (cities[i-1]=='F' && cities[i]=='S') FS+=1;
            else if (cities[i-1]=='S' && cities[i]=='F')SF+=1;
        }
        if (SF>FS)System.out.println("YES");
        else System.out.println("NO");
    }
}
