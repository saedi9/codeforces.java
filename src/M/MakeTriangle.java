package M;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MakeTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] v= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int minuts=0;
        Arrays.sort(v);
        if(v[0]+v[1]<=v[2]){minuts=v[2]-(v[0]+v[1])+1;}
        System.out.println(minuts);
    }
}
