package T;

import java.util.Scanner;

public class TokitsukazeAndEnhancement {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if ((x - 1) % 4 == 0) { System.out.println("0 A"); }
        else { System.out.println(best_cat(x)); }
    }

    static int cat(int x) {
        if ((x - 1) % 4 == 0) { return 0; }
        else if ((x - 3) % 4 == 0) { return 1; }
        else if ((x - 2) % 4 == 0) { return 2; }
        else if (x % 4 == 0) { return 3; }
        return 10;
    }

    static String best_cat(int x) {
        int[] cats = new int[3];
        int min = 6, num = 0;
        for (int i = 0; i < 3; i++) { cats[i] = cat(x + i); }
        for (int i = 0; i < 3; i++) { if (cats[i] < min) { min = cats[i];num = i; } }
        switch (min) {
            case 0: return num + " " + "A";
            case 1: return num + " " + "B";
            case 2: return num + " " + "C";
            case 3: return num + " " + "D";
        }
        return null;
    }
}
