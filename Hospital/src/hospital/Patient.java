
package hospital;
import checkInfo.*;

public class Patient {
    
    int age;
    int sBP;
    int dBP;
    
    public void checkInformation(int age, int sBP, int dBP) throws checkInfo{
        
        if(age >= 5 && sBP>39 && sBP<251 && dBP>29 && dBP<141){
            System.out.println("Valid Information");
        }
        else
            throw new checkInfo("Invalid Information");
    }
}
