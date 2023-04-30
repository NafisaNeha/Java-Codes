
package demo;


public class Car extends Vehicle{
    @Override
    void move(){
        System.out.println("Move the gear shift into drive position");
        System.out.println("A car starts to move");
    }
    void stop(){
        System.out.println("Push on a break pedal");
        System.out.println("The car is stooped");
    }
    void moveToDestination(String source, String destination){
        System.out.println("Starts from soruce:" +source);
        move();
        System.out.println("Approach to the destination:" +destination);
        stop();
    }
}
