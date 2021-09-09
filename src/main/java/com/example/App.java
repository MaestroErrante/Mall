package com.example;

import java.util.ArrayList;

// Encapsulation
// Class
// Object
// Attribute
// Methods
// Access Modifiers
// Inheritance (Super Keyword)
// Polymorphis
// overriding - interface class and abstract class
// interface class - keyword implements
// static methods
// IDE - IntelliJ, eclipse
// JDK,JVM,JRE
// Difference between string class methods and string data type
// dot operator
// Collections - List,set,map,stack,queue and vector
// Please focus on only List,set,map
// List - array list and linked list
// Exception handling - try,catch,throw,throws
// Spring boot and web services
// Dot operator

// Please help the mall owner to implement the following requirements:
//  Display the total products asset value of the store for the request store name/
//  Compare the prices of the prices of the requested product name by the user in all the 
//  relevant stores in the mall and display

// Guideline to implement the above real time requirements
// Create Java application
// Create packages, classes and objects
// Use collections (Array, Map or set) depends on the requirement
// Use interface class if its applicable
// Use Exception handling for the class attributes validation. Raise appropriate error or 
// information messages
// Use loops, Control Structure wherever necessary

public class App 
{
    public static ArrayList<Store> stores = new ArrayList<>();
    public static void main( String[] args )
    {
        Product product1 = new Product(0,"prod1","type1",1,10.1);
        Product product2 = new Product(1,"prod2","type1",2,0.1);
        Product product3 = new Product(2,"prod3","type2",3,30.3);
        ArrayList<Product> list1 = new ArrayList<>();
        list1.add(product1);
        list1.add(product2);
        list1.add(product3);
        Product product4 = new Product(3,"prod4","type2",4,40.4);
        Product product5 = new Product(4,"prod2","type3",5,50.5);
        Product product6 = new Product(5,"prod6","type3",6,10.1);
        ArrayList<Product> list2 = new ArrayList<>();
        list2.add(product4);
        list2.add(product5);
        list2.add(product6);
        Product product7 = new Product(6,"prod7","type4",7,20.2);
        Product product8 = new Product(7,"prod2","type4",8,1.0);
        Product product9 = new Product(8,"prod9","type5",9,40.4);
        ArrayList<Product> list3 = new ArrayList<>();
        list3.add(product7);
        list3.add(product8);
        list3.add(product9);
        Store store1= new Store(1,"store1", Location.First,list1);
        Store store2= new Store(2,"store2", Location.Second,list2);
        Store store3= new Store(3,"store3", Location.Third,list3);
        stores.add(store1);
        stores.add(store2);
        stores.add(store3);
        //searchByProduct("prod2");
        //store3.showProducts();
        //searchByStore("store3");
        searchByBestPricet("prod2");
    }

    public static void searchByProduct(String product){
        for(int i = 0 ; i<stores.size(); i ++){
            ArrayList<Product> products = stores.get(i).getProducts();
            for(int j = 0; j<products.size(); j++){
                if(products.get(j).getName() == product){
                    System.out.println(stores.get(i).toString());
                }
            }
        }
    }
    
    public static void searchByBestPricet(String product) {
        Product bestOne = null;
        Store store = null;
        for (int i = 0; i < stores.size(); i++) {
            ArrayList<Product> products = stores.get(i).getProducts();
            for (int j = 0; j < products.size(); j++) {
                if (products.get(j).getName() == product) {
                    if(bestOne != null){
                        if(products.get(j).getPrice() < bestOne.getPrice()){
                            bestOne = products.get(j);
                            store = stores.get(i);
                        }
                    }
                    else{
                        bestOne = products.get(j);
                        store = stores.get(i);
                    }
                }
            }
        }
        System.out.println(store.toString());
        System.out.println(bestOne.toString());
    }

    public static void searchByStore(String store){
        for (int i = 0; i < stores.size(); i++) {
            if (stores.get(i).getName() == store) {
                System.out.println(stores.get(i).toString());
            }
        }
    }
}