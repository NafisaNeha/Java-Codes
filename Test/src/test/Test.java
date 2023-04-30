
package test;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        Circle c1 = new Circle(a);
        Circle c2 = new Circle(b);
                       
        System.out.println("Area of the First Circle : "+c1.volumeCalculate());
        System.out.println("Area of the Second Circle : "+c2.volumeCalculate());
        
        double C1 = c1.getRadius();
        double C2 = c2.getRadius();
        
        if(C1>C2){
            System.out.println("First Circle is larger");
        }
        else
            System.out.println("Second Circle is larger");
    }
    
}
