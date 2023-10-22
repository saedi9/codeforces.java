package W;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while (n-->0){
            String line=sc.nextLine();
            if(line.length()>10){ System.out.println(String.valueOf(line.charAt(0))+(line.length()-2)+ line.charAt(line.length() - 1)); }
            else System.out.println(line);
        }
    }
}
