package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        if(isVeg){
            super.bill+="Extra Cheese Added: "+cheese+"\n";
            super.bill+="Extra Toppings Added: "+topVege+"\n";
            super.price+=super.cheese+super.topVege;
            super.isCheeseAdd=true;
            super.isTopAdd=true;
        }
        else{
            super.bill+="Extra Cheese Added: "+cheese+"\n";
            super.bill+="Extra Toppings Added: "+topNonVege+"\n";
            super.price+=super.cheese+super.topVege;
            super.isCheeseAdd=true;
            super.isTopAdd=true;
        }


    }
}
