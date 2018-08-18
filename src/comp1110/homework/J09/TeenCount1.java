package comp1110.homework.J09;

import java.util.function.Predicate;


public class TeenCount1 {
    private int i=0;



    public static int[] teenLess(int[] array){
        int s1=0;

        //Predicate belong;
        for (int y =0 ; y<array.length;y++) {
            if (array[y] < 13 || array[y] > 19) {
                s1++;
            }
        }
        int[]l=new int[s1];
        //count count=(array[0] < 13 || array[0] > 19)->{};
    return array;
    }

    interface count{
        void operation(int a);

    }

}
