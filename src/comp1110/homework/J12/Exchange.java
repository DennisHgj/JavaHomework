package comp1110.homework.J12;

public class Exchange {
    public static <T> T[] swap(T[] a, int i, int j) {
        T s;
        T l;
        boolean x = false;
        boolean y=false;
        try {
            l = a[i];

        } catch (ArrayIndexOutOfBoundsException e) {
            x = true;
        }
        try {
            l=a[j];
        }catch (ArrayIndexOutOfBoundsException e1){
            y=true;
        }
        if (i < 0 || j < 0 || x || y) {
            return a;
        } else {
            s = a[i];
            a[i] = a[j];
            a[j] = s;
            return a;
        }
    }
}
