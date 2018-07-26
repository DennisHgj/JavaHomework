package comp1110.homework.J04;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Name= in.nextLine();
        int a = Name.length();
        System.out.println(Name.toUpperCase());
        System.out.println(a);
    }
}
