package T;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;


public class TeamForming {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;

        sc.nextLine();
        int[] skill= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(skill);
        for (int i = 0; i < n; i+=2) {
            sum+=(skill[i+1]-skill[i]);
        }
        System.out.println(sum);
    }
}
