public class Triangle implements Shape{

    private double base1,side1,side2,height;

    public Triangle(double base1,double side1,double side2,double height){
        this.base1 = base1;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (0.5*base1*height);
    }

    @Override
    public double calculatePerimeter() {
        return (base1+side1+side2);
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
}
