
package foods;


public class Foods {

    
    public static void main(String[] args) {
        
        System.out.println("Preparing the order of Burger: ");
        
        Pizza item1 = new Burger("200");
        item1.assembleItems(item1);
        item1.arrangeIngredients();
        item1.finishItems();
        System.out.println("");
        
        
        System.out.println("Preparing the order of Pizza: ");
        
        Pizza item2= new Pizza();
        item2.setPrice("The price of pizza is 350 Taka");
        System.out.println(item2.getPrice());
        
        Pizza item3= new Pizza();
        item3.assembleItems(item3);
        item3.arrangeIngredients();
        item2.finishItems();
        System.out.println("");
        
        
        System.out.println("Preparing the order of Kacchi: ");
        
        Kacchi obj5= new Kacchi();
        item2.setPrice("The price of pizza Kacchi 500 Taka");
        System.out.println(item2.getPrice());
        
        Kacchi obj3 = new Kacchi();
        obj3.arrangeIngredients();
        obj3.assembleItems(obj3);
        obj3.finishItems();
        System.out.println("");
    }
    
}
