package com.school.smp1.models;

public class Product {
    private final long id;
	private final String title;
    private final String description;
    private final int price;
    
    public Product(long id, String title, String description, int price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}