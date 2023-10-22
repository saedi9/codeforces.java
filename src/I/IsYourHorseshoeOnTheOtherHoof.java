package I;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] color= Stream.of(sc.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        HashMap<Integer,Integer> table=new HashMap<>();
        int counter=0;
        for (int i = 0; i < color.length; i++) {
            if(table.containsKey(color[i]))counter++;
            else{table.put(color[i],table.get(color[i]+1));}
        }
        System.out.println(counter);
    }
}
