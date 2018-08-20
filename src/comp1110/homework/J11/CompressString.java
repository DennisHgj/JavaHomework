package comp1110.homework.J11;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ori = in.nextLine();
        int count = 0;
        char s = '%';
        for (int i = 0; i < ori.length(); i++) {
            if (s != ori.charAt(i)) {
                System.out.print(ori.charAt(i));
                s = ori.charAt(i);
                count = counts(ori, s, i);
                if (count > 1) {
                    System.out.print(count);
                }

            }

        }
        System.out.println();
    }

    public static int counts(String x, char s, int loc) {
        int counts = 0;
        for (int i = loc; i < x.length(); i++) {
            if (s == x.charAt(i)) {
                counts++;
            } else {
                if (counts != 0) {
                    break;
                }
            }
        }
        return counts;
    }
}
