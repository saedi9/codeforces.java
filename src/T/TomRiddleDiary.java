package T;

import java.util.*;

public class TomRiddleDiary {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Set<String> set=new HashSet<>();
        boolean[] is=new boolean[n];
        for (int i = 0; i < n; i++) {
            String temp=sc.nextLine();
            if(set.contains(temp)){ System.out.println("YES"); }
            else {set.add(temp);System.out.println("NO");}
        }
    }
}
