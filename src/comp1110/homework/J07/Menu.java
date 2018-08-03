package comp1110.homework.J07;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Please enter:\n" +
                "1 to find range of the scores\n" +
                "2 to find the maximum score\n" +
                "3 to find the second highest score");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
        int size =in.nextInt();
        int i ;
        int []l= new int[size];
        int []ls= new int[size];
        int max;

        for (i=0;i<size;i++){
            l[i]=in.nextInt();
        }
        if(choose==1){

            int range = findRange(l);
            System.out.println(range);
        }
        else if (choose==2){
            int Max=getMax(l);
            max = Max;
            System.out.println(max);

        }
        else if (choose==3){
            /*if (size==1){
                System.out.println("Invalid Option Selected");
            }

            else {
                max = getMax(l);
                if (size == 2) {
                    for (int s = 0; s < size; s++) {
                        if (l[s] == max) {
                            System.out.println(l[s + 1]);
                        }
                    }
                } else {
                    for (int s = 0; s < size; s++) {
                        if (l[s] == max) {
                            ls[s] = 0;
                        } else {
                            ls[s] = l[s];
                        }
                    }
                    int second_high = getSecondHighest(ls);
                    System.out.println(second_high);
                }
            }*/
            int second_high=getSecondHighest(l);
            System.out.println(second_high);
        }


    }

    public static int findRange(int[] array){
        int range =0;
        int min =array[0];
        int size =array.length;
        int max =getMax(array);

        //System.out.println(min);
        for (int i=0; i<size;i++) {
            if (min > array[i]) { min = array[i]; }
        }
        range=max-min;

        //System.out.println(min);

        return range;
    }

    public static int getMax(int[] array){
        int max = 0;
        int size = array.length;
        max = array[0];
        for (int i=0; i<size;i++){
            if (max<array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static int getSecondHighest(int[] array){
        int second_high = 0;
        int size = array.length;
        int []ls = new int[size];

        if (size==1){
            System.out.println("Invalid Option Selected");
        }
        else {
            int max = getMax(array);
            if (size == 2) {
                for (int s = 0; s < size; s++) {
                    if (array[s] == max) {
                        System.out.println(array[s + 1]);
                    }
                }
            } else {
                for (int s = 0; s < size; s++) {
                    if (array[s] == max) {
                        array[s] = 0; }
                    else {
                        ls[s] = array[s]; }
                }
                second_high= array[0];

                for (int i=0; i<size;i++) {
                    if (second_high < ls[i]) {
                        second_high = ls[i]; }

                }
            }
        }


        /*second_high= array[0];

        for (int i=0; i<size;i++){
            if (second_high<array[i]){
                second_high= array[i];
            }
        }*/
        return second_high;
    }


}
