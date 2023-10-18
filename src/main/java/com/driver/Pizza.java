package com.driver;

public class Pizza {

     int price;
     Boolean isVeg;
     String bill;
     int totalPrice;

     int cheese=80;
     int topVege=70;
     int topNonVege=120;
     int paperBag=20;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        this.bill="Base Price Of The Pizza: "+price+"\n";
        this.totalPrice=price;
    }

    public int getPrice(){

        return this.price;
    }

    int ct=0;
    public void addExtraCheese(){
        if(ct==0){
            this.bill+="Extra Cheese Added: "+cheese+"\n";
            this.totalPrice+=cheese;
            ct++;
        }

    }
int tp=0;
    public void addExtraToppings(){
        this.addExtraCheese();
        if(tp==0){
            if(isVeg){
                this.bill+="Extra Toppings Added: "+topVege+"\n";
                this.totalPrice+=topVege;
            }
            else{
                this.bill+="Extra Toppings Added: "+topNonVege+"\n";
                this.totalPrice+=topNonVege;
            }
            tp++;
        }


    }

    public void addTakeaway(){
        this.bill+="Paperbag Added: "+paperBag+"\n";
        this.totalPrice+=paperBag;
    }

    public String getBill(){
        this.bill+="Total Price: "+totalPrice;
        return this.bill;
    }
}
