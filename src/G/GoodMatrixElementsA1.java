package G;

import java.util.Scanner;
import java.util.stream.Stream;

public class GoodMatrixElementsA1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),res=0;
        sc.nextLine();
        int[][] matrix=new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] temp= Stream.of(sc.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=temp;
        }
        for (int i = 0; i < n; i++) {
            res+=matrix[i][i];
            matrix[i][i]=0;
            res+=matrix[i][n-i-1];
            matrix[i][n-i-1]=0;
            int h=(n-1)/2;
            res+=matrix[i][h];
            matrix[i][h]=0;
            res+=matrix[h][i];
            matrix[h][i]=0;
        }
        System.out.println(res);
    }
}
