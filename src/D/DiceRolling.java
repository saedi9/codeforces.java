package D;

import java.util.Scanner;

public class DiceRolling {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0){
            double x=sc.nextDouble();
            sc.nextLine();
            System.out.println((int)Math.ceil(x/7.0));
        }
    }
}
