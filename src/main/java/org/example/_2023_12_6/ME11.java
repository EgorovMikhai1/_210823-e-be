package org.example._2023_12_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class ME11 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 1; i < 6; i++) {
            map.put(i, "Value: " + i);
        }

        //System.out.println(map.keySet());
        //System.out.println(map.entrySet());
        //System.out.println(map.get(2));
        //System.out.println(map.containsKey(5));

        Map<Integer, String> map1 = new TreeMap<>();
        map1.put(10, "A");
        map1.put(5, "S");
        map1.put(12, "F");
        map1.put(63, "B");
        map1.put(11, "FF");
        map1.put(4, "T");

        System.out.println(map1);

        Map<Cat, String> catStringMap = new TreeMap<>();
        catStringMap.put(new Cat("Murka", 1), "A+");
        catStringMap.put(new Cat("Bars", 2), "A");
        catStringMap.put(new Cat("Cot", 1), "B+");
        catStringMap.put(new Cat("Test", 1), "X");
        catStringMap.put(new Cat("Seledka", 2), "C-");

        System.out.println(catStringMap);
    }
}

class Cat implements Comparable<Cat>{
    private String name;
    private int weight;

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    /**
     * Cat cat = new Cat();
     * Cat cat1 = new Cat();
     * cat.compareTo(cat1)
     */
    @Override
    public int compareTo(Cat o) {
        return this.name.compareTo(o.name);
    }
}