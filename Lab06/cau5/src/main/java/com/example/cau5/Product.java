package com.example.cau5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
    @Value("${id}")
    private String id;

    @Value("${name}")
    private String name;
    
    @Value("${price}")
    private int price;

    @Value("${description}")
    private String description;

    @Override
    public String toString() {
        return "[Product " + "id: " + id + " - name: " + name + " - price: " + price + " - description: " + description + ']';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
    	this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
