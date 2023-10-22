package E;

import java.util.Scanner;
public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] step={5,4,3,2,1};
        int tot=0;
        int dis=sc.nextInt();
        for (int i=0;i<step.length;i++){
            tot+=dis/step[i];
            dis%=step[i];
        }
        System.out.println(tot);
    }
}

