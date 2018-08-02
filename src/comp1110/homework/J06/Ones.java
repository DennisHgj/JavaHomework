package comp1110.homework.J06;
import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String valus;
        valus = Integer.toBinaryString(a);
        //System.out.println(valus);
        int length =valus.length();
       // System.out.println(length);
        int i;
        int s = 0;

        for (i=0;i<length;i++){

            String x = valus.substring(i,i+1);
            //System.out.println(x);
            if(x.equals("1")){
                s=s+1; }
               // else {s1++;}
        }
        System.out.println(s);



    }
}
