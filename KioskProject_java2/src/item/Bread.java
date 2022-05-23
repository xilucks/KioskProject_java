package item;

import java.util.ArrayList;

public class Bread {
    String core;
    String bread;
    String cheese;

    public int price;

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public ArrayList<String> getVegetables() {
        return vegetables;
    }

    public void setVegetables(ArrayList<String> vegetables) {
        this.vegetables = vegetables;
    }

    public ArrayList<String> getSauce() {
        return sauce;
    }

    public void setSauce(ArrayList<String> source) {
        sauce = source;
    }

    public boolean getSet() {
        return set;
    }

    public void setSet(boolean set) {
        this.set = set;
    }

    ArrayList<String> vegetables;
    ArrayList<String> sauce;

    private boolean set;

    public Bread(String core, String bread, String cheese, ArrayList<String> vegetables, ArrayList<String> sauce, boolean set, int price) {
        this.core = core;
        this.bread = bread;
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.sauce = sauce;
        this.set = set;
        this.price = price;
    }
}
