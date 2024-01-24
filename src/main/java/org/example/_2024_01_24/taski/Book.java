package org.example._2024_01_24.taski;

import java.io.Serializable;

class Book implements Serializable {
    private int id;
    private String title;
    private String author;
    private int year;
    private double price;

    public Book(int id, String title, String author, int year, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }
}