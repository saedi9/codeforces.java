package V;

import java.util.Scanner;
import java.util.stream.Stream;

public class VanyaAndFence {
    public static void main(String [] arg){
        Scanner sc=new Scanner(System.in);
        int[] fLine= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] sLine= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int width=0;
        for (int i = 0; i < sLine.length; i++) {
            if (fLine[1]>=sLine[i])width+=1;
            else width+=2;
        }
        System.out.println(width);
    }
}
