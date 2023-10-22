package P;

import java.util.Scanner;

public class PetyaAndOrigami {
    public static void main(String[] ar){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        double red=n*2,green=n*5,blue=n*8;
        int tot=0;
        tot = (int)(Math.ceil(red/k)+Math.ceil(green/k)+Math.ceil(blue/k));
        System.out.println(tot);
    }
}
