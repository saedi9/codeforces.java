package A;

import java.util.*;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Set<String> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i)))set.add(String.valueOf(s.charAt(i)));
        }
        System.out.println(set.size());
    }
}
