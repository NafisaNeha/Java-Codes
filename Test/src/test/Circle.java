
package test;
import java.lang.Math;

public class Circle {
    
    private double radius;
    
    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double volumeCalculate(){
        double res = (Math.PI*radius*radius);
        return res;
    }
    
}
