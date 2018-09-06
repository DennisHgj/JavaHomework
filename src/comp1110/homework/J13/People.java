package comp1110.homework.J13;

import comp1110.homework.J04.Name;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String a = in.next();
            if (in.hasNextInt()) {
                Integer b = in.nextInt();
                map.put(a, b);
            }
            /*Integer b = in.nextInt();
            if(b==null){
                String s= map.getOrDefault(a,"unknown").toString();
                System.out.println(s);
            }
            else {

            }*/
            else {
                Integer s = map.getOrDefault(a, -1);
                if (s == -1) {
                    System.out.println("unknown");
                } else {
                    System.out.println(s);
                }
            }

        }
        //String c = in.nextLine();
        //System.out.println(map.getOrDefault(c,"unknown"));

    }
}
