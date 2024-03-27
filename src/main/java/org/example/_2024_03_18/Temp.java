package main.java.org.example._2024_03_18;

public class Temp {
    public int id;
    public String name;
    private double price = 9999;

//    public Temp(int id) {
//        this.id = id;
//    }

    public Temp(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    public Temp(int id, String name, double price) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
