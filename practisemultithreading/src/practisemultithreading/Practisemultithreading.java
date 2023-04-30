

package practisemultithreading;


public class Practisemultithreading {

    
    public static void main(String[] args) {
       mythread1 obj1 = new mythread1();
   mythread2 obj2  = new mythread2();
   obj1.start();
        System.out.println("my id is:"+obj1.getId());
   obj2.start();
        System.out.println("my another id is:"+obj2.getId());
        System.out.println("the name of my thread is:"+obj2.getName());
   //obj2.stop();
    }
    
}
