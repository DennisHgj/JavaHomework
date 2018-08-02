package comp1110.homework.J06;
import java.util.Scanner;
import java.util.Arrays;


public class Permute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        boolean d= true;
        if (s1.length() != s2.length()) {
            d=false;
        }
        else {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            int y = 0;
            for (int i = 0; i < s1.length(); i++) {
                if(ch1[i]!=ch2[y]){
                    d=false; }
                    y++;
            }


        }
        if(!d ){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
