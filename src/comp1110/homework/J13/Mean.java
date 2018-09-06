package comp1110.homework.J13;

import java.util.ArrayList;
import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        ArrayList list =new ArrayList<Double>() ;
        Scanner in = new Scanner(System.in);
        double a;
        double b=0;

        while (in.hasNext()){
            a = in.nextDouble();
            list.add(a);
        }

        for (int i=0;i<list.size();i++){
            b=b+(double)list.get(i);
        }
        double mean = b/list.size();
        System.out.println(mean);

    }




}
