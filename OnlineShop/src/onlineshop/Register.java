
package onlineshop;
import exception.*;

public class Register {
    public void checkCityNum(String city, String num) throws checkCityNumEx{
        
        if( (city=="Dhaka"||city=="Chittagong") && num.startsWith("01")){
            System.out.println("Valid Information");
        }
        else
            throw new checkCityNumEx("Invalid Information");
    }
}
