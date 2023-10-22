package T;

import java.util.Scanner;
import java.util.stream.Stream;

public class TanyaAndStairways {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int counter=1;
        String l="";
        sc.nextLine();
        int [] steps= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < n-1; i++) {
            if(steps[i]>=steps[i+1]){l+=steps[i]+" ";counter++;}
        }
        System.out.println(counter);
        System.out.println(l+steps[n-1]);
    }
}
