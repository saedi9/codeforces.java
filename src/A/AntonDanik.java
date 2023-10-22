package A;

import java.util.Scanner;

public class AntonDanik {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        char [] winners=sc.nextLine().toCharArray();
        int tot_A=0;
        int tot_D=0;
        for(char s: winners){
            if (s == 'A')tot_A+=1;
            else if(s=='D') tot_D+=1;
        }
        if(tot_A>tot_D)System.out.println("Anton");
        else if (tot_D>tot_A) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}
