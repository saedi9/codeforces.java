package D;

import java.util.Scanner;

public class Drinks {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        double sum=0;
        for (int i = 0; i < n; i++) {
            sum+=sc.nextInt();
        }
        System.out.println(sum/n);
    }
}
