package comp1110.homework.J01;
import java.util.Scanner;

public class NumberWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String words = in.next();
        int number = in.nextInt();
        System.out.println(number+", "+words);
    }
}
