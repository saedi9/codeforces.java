package N;

import java.util.Scanner;

public class NightAtMuseum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c='a';
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int a=Math.abs(s.charAt(i)-c);
            if(c<s.charAt(i)){
                sum += Math.min(a,Math.abs(c-'a')+Math.abs(s.charAt(i)-'z')+1);
            }
            else{
                sum += Math.min(a,Math.abs(s.charAt(i)-'a')+Math.abs(c-'z')+1);
            }
            c=s.charAt(i);
        }
        System.out.println(sum);
    }
}
