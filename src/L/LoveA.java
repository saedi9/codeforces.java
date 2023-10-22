package L;

import java.util.Scanner;

public class LoveA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = sc.nextLine().toCharArray();
        int tot_a=0;
        for (int i = 0; i < word.length; i++) {
            if (word[i]=='a') tot_a+=1;
        }
        tot_a*=2;
        if (tot_a>word.length)System.out.println(word.length);
        else System.out.println(tot_a-1);
    }
}


