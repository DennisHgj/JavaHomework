package comp1110.homework.J13;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    private String name;
    private int stock;
    private int price;
    private int rate;
    private int reorderdays;
    private HashMap<String, Integer> name_stock = new HashMap<>();
    private HashMap<String, Integer> name_price = new HashMap<>();
    private HashMap<String, Integer> name_rate = new HashMap<>();
    private HashMap<String, Integer> name_reorderdays = new HashMap<>();
    private HashMap<String, Integer> name_order = new HashMap<>();


    public Shop(String name, int stock, int price, int rate, int reorderdays) {
        this.stock = stock;
        this.price = price;
        this.name = name;
        this.rate = rate;
        this.reorderdays = reorderdays;
    }

    public Shop() {

    }

    void addItem(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        /*try {
            name_stock.put(this.name, this.stock);
        } catch (NullPointerException n1) {
            name_stock.put(name, 0);
        }
        try{
        name_price.put(this.name, this.price);}
        catch (NullPointerException n2){
            name_price.put(name,0);
        }*/
        name_stock.put(this.name, this.stock);
        name_price.put(this.name, this.price);
    }

    int totalStockValue() {
        int sum = 0;
        for (String key : name_stock.keySet()) {
            sum = sum + (name_stock.getOrDefault(key, 0) * name_price.getOrDefault(key, 0));
        }

        return sum;
    }

    void addItem(String name, int stock, int price, int rate, int reorderdays) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.rate = rate;
        this.reorderdays = reorderdays;
        name_stock.put(name, stock);
        name_price.put(name, price);
        name_rate.put(name, rate);
        name_reorderdays.put(name, reorderdays);

    }

    HashMap reorder() {
        int order = 0;
        for (String key : name_stock.keySet()) {
            if (name_stock.get(key) < name_rate.get(key) * name_reorderdays.get(key)) {
                order = 7 * name_rate.get(key) - name_stock.get(key);
                if (order > 0) {
                    name_order.put(key, order);
                }
            }
        }

        return this.name_order;

    }
}
