package comp1110.homework.J05;
import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int time = in.nextInt();
        int minute = time%60;
        int hour = time/60;

        if(time<60){
            if (time == 1){System.out.println(name+" runs for "+time+" minute");}
            else{System.out.println(name+" runs for "+time+" minutes");}
        }
        else {
            if (minute == 0) {
                if (hour == 1) {
                    System.out.println(name + " runs for " + hour + " hour");
                } else {
                    System.out.println(name + " runs for " + hour + " hours");
                }
            }
            else {
                if (hour == 1) {
                    System.out.println(name + " runs for " + hour + " hour and " + minute + " minutes");
                } else {
                    System.out.println(name + " runs for " + hour + " hours and " + minute + " minutes");
                }
            }
        }


    }
}
