package org.example._2023_12_6;

import com.github.javafaker.Faker;

import java.util.*;

public class LE1 {
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            carList.add(new Car(FAKER.country().name(), RANDOM.nextInt(400)));
        }

        System.out.println(carList);
        Collections.sort(carList, new HorsePowerComparator());

        System.out.println("******************************************************");
        System.out.println(carList);
    }
}

class Car implements Comparable<Car>{
    private String model;
    private int horsePower;

    public Car(String model, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Car o) {
        return this.model.compareTo(o.model);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}

class HorsePowerComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o2.getHorsePower() - o1.getHorsePower();
    }
}

class ModelPowerComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}