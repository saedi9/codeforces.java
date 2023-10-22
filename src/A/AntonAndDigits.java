package A;

import java.util.HashMap;
import java.util.Scanner;

public class AntonAndDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k2=sc.nextInt(),k3=sc.nextInt(),k5=sc.nextInt(),k6=sc.nextInt();
        int min=Math.min(k2,Math.min(k5,k6));
        k2-=min;
        System.out.println(min*256+Math.min(k2,k3)*32);
    }
}
