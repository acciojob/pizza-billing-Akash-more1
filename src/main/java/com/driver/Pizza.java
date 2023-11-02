package com.driver;

public class Pizza {

     int price;
     Boolean isVeg;
     String bill;


     int cheese=80;
     int topVege=70;
     int topNonVege=120;
     int paperBag=20;

     boolean isCheeseAdd;
     boolean isTopAdd;
     boolean isBagAdd;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        this.bill="Base Price Of The Pizza: "+price+"\n";


        isCheeseAdd=false;
        isTopAdd=false;
        isBagAdd=false;
    }

    public int getPrice(){

        return this.price;
    }


    public void addExtraCheese(){
        if(isCheeseAdd==false){
            this.bill+="Extra Cheese Added: "+cheese+"\n";
            this.price+=cheese;
            isCheeseAdd=true;
        }

    }

    public void addExtraToppings(){
        this.addExtraCheese();
        if(isTopAdd==false){
            if(isVeg){
                this.bill+="Extra Toppings Added: "+topVege+"\n";
                this.price+=topVege;
            }
            else{
                this.bill+="Extra Toppings Added: "+topNonVege+"\n";
                this.price+=topNonVege;
            }
            isTopAdd=true;
        }


    }

    public void addTakeaway(){
        if(isBagAdd==false){
            this.bill+="Paperbag Added: "+paperBag+"\n";
            this.price+=paperBag;
            isBagAdd=true;
        }

    }

    public String getBill(){
        this.bill+="Total Price: "+price;
        return this.bill;
    }
}
