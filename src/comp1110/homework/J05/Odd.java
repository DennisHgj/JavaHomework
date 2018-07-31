package comp1110.homework.J05;
import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.Scanner;


public class Odd {
    public static boolean isodd(int i){
        /*if(i%2==0){
            System.out.println(i + " is even");
            return false;
        }
        else {
            System.out.println(i + " is odd");
            return true;
        }*/
        if(i%2!=0||i==1){
            System.out.println(i + " is odd");
            return true;
        }
        else {
            System.out.println(i + " is even");
            return false;

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isodd(num);


    }

}
