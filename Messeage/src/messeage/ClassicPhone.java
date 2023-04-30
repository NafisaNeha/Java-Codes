
package messeage;


public class ClassicPhone extends Phone {
    public void messageShow(String a){
        if(a.length()<=100){
            System.out.println("The Messege is "+a);
        }
        else if (a.length()>100){
            System.out.println("Part one of the Messege is "+a.substring(0,101));
            System.out.println("Part two of the Messege is "+a.substring(101));
        }
    }
}
