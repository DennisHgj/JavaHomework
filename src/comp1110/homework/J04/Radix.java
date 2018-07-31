package comp1110.homework.J04;
import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soursebase = in.nextInt();
        int destinationbase = in.nextInt();
        String ori_num = in.next();
        //System.out.println(num.substring(1,2));
        int i = ori_num.length();
        String first = ori_num.substring(0,i-1);
        String second =ori_num.substring(i-1,i);
        int f1 = Integer.parseInt(first);
        int s1 = Integer.parseInt(second);
        int origin_number= 0;
        //String des_num="";
        origin_number = soursebase*f1+s1;
        int f2=0;
        int s2=0;
        f2 = origin_number/destinationbase;
        s2 = origin_number%destinationbase;
        System.out.println(f2+""+s2);
    }
}
