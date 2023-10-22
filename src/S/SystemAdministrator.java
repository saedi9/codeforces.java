package S;

import java.util.Scanner;
import java.util.stream.Stream;

public class SystemAdministrator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int ax=0,ay=0,bx=0,by=0;
        for (int i = 0; i < n; i++) {
            int[] line= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(line[0]==1){ax+=line[1];ay+=line[2];}
            else{bx+=line[1];by+=line[2];}
        }
        if(ax>=ay) System.out.println("LIVE");
        else System.out.println("DEAD");

        if(bx>=by) System.out.println("LIVE");
        else System.out.println("DEAD");
    }
}
