
package foods;


public class Pizza implements Preparation{
    
    private String price;
    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price = price;
    }
    
    public String arrangeIngredients(){
        return " Flour, Cheese, Pepperoni, Yoghurt";
    }
    public void assembleItems(Preparation P){
        System.out.println("Assembling Items"+P.arrangeIngredients());
    }
    public void finishItems(){
        System.out.println("Your Pizza is ready!...");
    }
    
    
}
