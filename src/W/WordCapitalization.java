package W;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder(sc.nextLine());
        s.setCharAt(0,Character.toUpperCase(s.charAt(0)));
        System.out.println(s);
    }
}
