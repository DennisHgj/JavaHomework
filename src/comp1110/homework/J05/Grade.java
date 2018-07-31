package comp1110.homework.J05;
        import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = in.nextInt();
        if (grade<0){
            System.out.println("Bad mark"); }
            else {
            if (grade < 50) {
                System.out.println("N");
            } else {
                if (grade < 60) {
                    System.out.println("P");
                } else {
                    if (grade < 70) {
                        System.out.println("C");
                    } else {
                        if (grade < 80) {
                            System.out.println("D");
                        } else {
                            if (grade<101){
                            System.out.println("HD");}
                            else {
                                System.out.println("Bad mark");
                            }
                        }
                    }
                }

            }
        }
    }
}
