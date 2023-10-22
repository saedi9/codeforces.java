package A;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AboyOrGirl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Character> distinct=new HashSet<>();
        char[] word=sc.nextLine().toCharArray();
        for (int i = 0; i < word.length; i++) {
            distinct.add(word[i]);
        }
        if(distinct.size()%2!=0){
            System.out.println("IGNORE HIM!");
        }else {
            System.out.println("CHAT WITH HER!");
        }
    }
}
