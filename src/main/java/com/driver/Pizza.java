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
      //  this.bill="Base Price Of The Pizza: "+price+"\n";


        isCheeseAdd=false;
        isTopAdd=false;
        isBagAdd=false;
    }

    public int getPrice(){

        return this.price;
    }


    public void addExtraCheese(){
        if(isCheeseAdd==false){
           // this.bill+="Extra Cheese Added: "+cheese+"\n";
            this.price+=cheese;
            isCheeseAdd=true;
        }

    }

    public void addExtraToppings(){
       // this.addExtraCheese();
        if(isTopAdd==false){
            if(isVeg){
              //  this.bill+="Extra Toppings Added: "+topVege+"\n";
                this.price+=topVege;
            }
            else{
              //  this.bill+="Extra Toppings Added: "+topNonVege+"\n";
                this.price+=topNonVege;
            }
            isTopAdd=true;
        }


    }

    public void addTakeaway(){
        if(isBagAdd==false){
            //this.bill+="Paperbag Added: "+paperBag+"\n";
            this.price+=paperBag;
            isBagAdd=true;
        }

    }

//    public String getBill(){
//        this.bill+="Total Price: "+price;
//        return this.bill;
//    }
public String getBill(){
    // your code goes here
    if(isVeg){
        bill = "Base Price Of The Pizza: 300 \n";
    }
    else{
        bill = "Base Price Of The Pizza: 400 \n";
    }

    if(isCheeseAdd){
        bill += "Extra Cheese Added: 80 \n";
    }

    if(isTopAdd){
        if(isVeg){
            bill += "Extra Toppings Added: 70 \n";
        }
        else{
            bill += "Extra Toppings Added: 120 \n";
        }
    }

    if(isBagAdd){
        bill += "Paperbag Added: 20 \n";
    }

    bill += "Total Price: " + this.price;
    return this.bill;
}
}
