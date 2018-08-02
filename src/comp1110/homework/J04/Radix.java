package comp1110.homework.J04;
import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base =in.nextInt();
        int dest = in.nextInt();
        String c = in.next();
        int mid = Integer.parseInt(c,base);
        String out = Integer.toString(mid,dest);
        System.out.println(out);

    }
}