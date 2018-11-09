package comp1110.homework.J09;

import java.util.function.Predicate;

public class TeenCount {
    public static int[] teenLess(int[] array) {

        int s = 0;
        int s1=0;
        //Predicate belong;
        for (int y =0 ; y<array.length;y++){
            if (array[y]<13||array[y]>19){
                s1++;
            }
        }
        int[] l = new int[s1];

        /*loop:
        for (int i = 0; i < array.length; i++) {
            for (int j = 13; j < 20; j++) {
                if (array[i] == j) {
                    continue loop;
                }

            }
            l[s]=array[i];
            s++;

        }*/
        for(int i=0;i<array.length;i++){
            if (array[i]>19||array[i]<13){
                l[s]=array[i];
                s++;
            }
        }
        return l;

        /*for(int i=0;i<array.length;i++){
            (array[i]<13&&array[i]>19)->{
                System.out.println("1");
            };*/
        }

    }


