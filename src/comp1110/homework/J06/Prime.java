package comp1110.homework.J06;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        /*for (int i = 2; i < num; i++) // 1不是素数，所以直接从2开始循环
            {
                for (int j =2; j < i; j++){
                    if(1%j==0){
                        break;
                    }
                }
                System.out.println(i);
        }
    }
}*/
        if (num==2){
            System.out.println(num);
        }
        else {loop: for (int i = 2; i < num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue loop;
                }
            }
            System.out.println(i);
        }
        }
    }
}
