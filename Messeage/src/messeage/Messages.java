package messeage;

import java.util.Scanner;


public class Messages {

    public static void main(String[] args) {
        String messege;
        
        SmartPhone sp= new SmartPhone();
        ClassicPhone cp=new ClassicPhone();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Type messege");
        messege=sc.nextLine();
        
        System.out.println("The Message in SmartPhone ");
        sp.messageShow(messege);
        System.out.println("The Message in Classic Phone ");
        cp.messageShow(messege);
    }

}
