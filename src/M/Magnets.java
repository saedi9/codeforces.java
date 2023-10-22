package M;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] magnets = new int[n];
        int counter=1;
        for (int i = 0; i < n; i++) {
            magnets[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i=1;i<n;i++){
            if(magnets[i-1]!=magnets[i]) counter+=1;
        }
        System.out.println(counter);
    }
}
