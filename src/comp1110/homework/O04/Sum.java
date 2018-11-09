package comp1110.homework.O04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Sum extends ArrayList<Integer> {
    private Integer elements;
    private Integer size;

    Sum(Integer elements,Integer size) {
        this.elements = elements;
        this.size= size;
    }
    public Sum(){

    }

    List<Integer> list = new ArrayList<Integer>();

    public int sum() {
        int sum = 0;
        list.add(this.elements);
        this.size=list.size();
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }


        return sum;
    }

    @Override
    public boolean add(Integer i) {
        this.elements=i;
        sum();
        return true;
    }


    @Override
    public void add(int index, Integer i) {
        for (int s =0;s<list.size();s++){

        }



    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return true;


    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c){
        return true;
    }


}
