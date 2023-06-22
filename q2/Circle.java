import java.lang.Math;

public class Circle implements Shape {

    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double value){
        this.radius = value;
    }
    @Override
    public double calculateArea() {
        return (Math.PI*this.radius*this.radius);
    }

    @Override
    public double calculatePerimeter() {
        return (2.0*Math.PI*this.radius);
    }
    
}
