package F;

import java.util.Scanner;
import java.util.stream.Stream;

public class FingerPrint {
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        sc.nextLine();
        int[] line= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] finger= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String res="";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(line[i]==finger[j])res+=line[i]+" ";
            }
        }
        System.out.println(res);
    }
}
