
package foods;


public class Kacchi implements Preparation{
    
    
    
    public String arrangeIngredients()
    {
        return " Rice, Mutton, Spice, Curd, Potato, Ghee, Pulm";
    }
    public void prepareIngredients()
    {
        System.out.println("Preparing Ingredients....");
    }
    
    public void assembleItems(Preparation P)
    {
        System.out.println("Assembling Items"+P.arrangeIngredients());
    }
    
    public void finishItems()
    {
        System.out.println("Your Kacchi is ready!...");
    }
    
}
