package B;

import java.util.Scanner;

public class BachGoldProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h=n/2;
        System.out.println(h);
        for (int i = 0; i < h; i++) {
            if(n%2==0) {System.out.print(2+" ");n-=2;}
            else {System.out.print(3+" ");n-=3;}
        }
    }
}
