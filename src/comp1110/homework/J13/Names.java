package comp1110.homework.J13;

import java.util.ArrayList;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String a;
        while (in.hasNext()){
            a=in.nextLine();
            list.add(a);

        }
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(list.size()-(i+1)));
        }

    }
}
