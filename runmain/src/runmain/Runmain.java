

package runmain;


public class Runmain {

    
    public static void main(String[] args) {
        runnable1  bullet1 =  new runnable1();
      Thread  gun1  = new Thread (bullet1);
      
     runnable2  bullet2  = new runnable2();
     
       Thread  gun2 = new Thread (bullet2);
       
       gun1.start();
        
       
       gun2.start();
      
    }
    
}
