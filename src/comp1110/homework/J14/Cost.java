package comp1110.homework.J14;

import java.util.*;

public class Cost {
    HashMap<String, Item> goods = new HashMap<>();

    void addItem(String name, int cost) {
        goods.put(name,new Item(name,cost));
    }

    void printCost(){
        //for (String key : goods.keySet()){
          //  System.out.println(key+' '+goods.get(key));
        //}
        ArrayList<Item> Keyname = new ArrayList<>(goods.values());
        Collections.sort(Keyname, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.compareTo(o2); }
        });
        for (Object print : Keyname) System.out.println(print);
    }

    /*int voucherWaste(int value){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);

    }*/
    int voucherWaste(int value) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        goods.forEach((name, item) -> addPossibleResult(result, goods.get(name).cost, value));
        result.removeIf(s -> s > value);
        Collections.sort(result);
        if (!result.isEmpty()) return value - result.get(result.size() - 1);
        else return value;
    }

    void addPossibleResult(ArrayList<Integer> result, int cost, int value) {
        int length = result.size();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= value / cost; j++) {
                if(!result.contains(result.get(i)+cost*j))
                    result.add(result.get(i) + cost * j);
            }
        }
    }



    public class Item implements Comparable<Item> {
        String name;
        int cost;   // in cents

        public Item(String n, int c) {
            name = n;
            cost = c;
        }

        public String toString() {
            return name + " " + cost;
        }


        @Override
        public int compareTo(Item o) {
            if (this.cost>o.cost) return 1;
            if(this.cost==o.cost){
                if(this.name.charAt(0)>o.name.charAt(0)) return 1;
                else return -1;
            }
            return -1;
        }


    }

}
