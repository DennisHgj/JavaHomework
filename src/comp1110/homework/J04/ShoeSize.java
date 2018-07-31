package comp1110.homework.J04;
import  java.util.Scanner;

public class ShoeSize {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double height= in.nextDouble();
        double ori_size = height*5;
        System.out.println( Math.round(ori_size));


    }
}
