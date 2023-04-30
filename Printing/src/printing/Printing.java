package printing;

import java.util.Scanner;


public class Printing {

    public static void main(String[] args) {
        
        pdf pdf1=new pdf();
        jpeg obj2=new jpeg();
        printer p=new printer();
        
        p.print(pdf1);
        p.print(obj2);
    }

}
