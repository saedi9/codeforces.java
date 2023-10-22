package A;

import java.util.Scanner;
import java.util.stream.Stream;

public class AnotherOneBitesTheDust {
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        long[] num= Stream.of(sc.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        if(num[0]==num[1]){ System.out.println((num[2]*2)+num[1]+num[0]); }
        else if(num[0]>num[1]){System.out.println((num[1]*2)+1+num[2]*2);}
        else {System.out.println((num[0]*2)+1+num[2]*2);}
    }
}
