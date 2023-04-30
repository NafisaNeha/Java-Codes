
package foods;


public class Burger extends Pizza{
    
    String price;
    
    Burger(String B){
        price = B;
        System.out.println("The price of the burger is " +B+ " taka");
    }

    public String arrangeIngredients(){
        return " Bread , Bacon, Barbecue Sauce, Onions, Cheese";
    }
    public void prepareIngredients(){
        System.out.println("Preparing Ingredients of burger....");
    }
    public void assembleItems(Preparation P){
        System.out.println("Assembling Items"+P.arrangeIngredients());
    }
    public void finishItems(){
        System.out.println("Your Burger is ready!...");
    }
    
}
