package comp1110.homework.J06;
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=1;
        for(i=1 ; i<=n ; i++){
            if (i%2==0){
                System.out.println(i+"\n");
            }


        }
    }
}
