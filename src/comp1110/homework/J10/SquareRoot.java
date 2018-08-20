package comp1110.homework.J10;

import java.math.BigDecimal;

public class SquareRoot {

    public static String findPreciseRoot(int n, int d) {
        String s2;
        if (n >= 0) {
            double s = Math.sqrt(n);
            if (s % 1 == 0) {
                int s3=(int) s;
                s2 = String.valueOf(s3);

            } else {
                BigDecimal s1 = new BigDecimal(s);
                s2 = s1.setScale(d, BigDecimal.ROUND_HALF_UP).toString();

            }
        }
        else {
            s2=String.valueOf(-1);
        }
        return s2;
    }
}
