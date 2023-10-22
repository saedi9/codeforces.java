package T;

import java.util.*;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] di=new int[3];
        for (int i = 0; i < 3; i++) {
            di[i]=sc.nextInt();
        }
        Arrays.sort(di);
        System.out.println((di[2]-di[1])+(di[1]-di[0]));
    }
}
