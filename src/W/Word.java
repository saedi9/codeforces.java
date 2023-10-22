package W;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] word=sc.nextLine().toCharArray();
        int l=0,u=0;
        for (int i = 0; i < word.length; i++) {
            if(Character.isLowerCase(word[i])){l++;}
            else u++;
        }
        if(l<u) {System.out.println(String.valueOf(word).toUpperCase());}
        else System.out.println(String.valueOf(word).toLowerCase());
    }
}
