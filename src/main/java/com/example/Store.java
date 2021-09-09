package com.example;

import java.util.ArrayList;

// Please help the mall owner to implement the following requirements:
//  Display the store details with Store id, name and location for given product name.
//  Display the location details to the user for the requested store name.
//  Display the total products asset value of the store for the request store name/
//  Compare the prices of the prices of the requested product name by the user in all the 
//  relevant stores in the mall and display

public class Store {
    private int id;
    private String name;
    private Location location;
    private ArrayList<Product> products;

    public Store(int id, String name, Location location, ArrayList<Product> prod){
        this.id = id;
        this.name = name;
        this.location = location;
        this.products = prod;
    }
    public int getId(){
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void showProducts(){
        for(int i=0;i<products.size();i++){
            System.out.println(products.get(i).toString());
        }
    }
    public String toString(){
        return  "id: "+id+", "+
                "name: "+name+", "+
                "location: "+location;
    }
}
