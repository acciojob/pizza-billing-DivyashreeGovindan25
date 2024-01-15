package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    //private boolean isDelux;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        //this.isDelux = isDelux;
        bill = "";
        if(isVeg){
            price = 300;
            bill += "Base Price Of The Pizza: 300";
        }
        else{
            price = 400;
            bill += "Base Price Of The Pizza: 400";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
            price += 80;
            bill += "\nExtra Cheese Added: 80";
    }

    public void addExtraToppings(){
        if(isVeg){
            price += 70;
            bill += "\nExtra Toppings Added: 70";
        }
        else{
            price += 120;
            bill += "\nExtra Toppings Added: 120";
        }
    }

    public void addTakeaway(){
        price += 20;
        bill += "\nPaperbag Added: 20";
    }

    public String getBill(){
        bill += "\nTotal Price: " + price;
        return this.bill;
    }
}
