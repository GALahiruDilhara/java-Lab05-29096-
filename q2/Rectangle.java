public class Rectangle implements Shape{

    private double height,width;

    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return (this.height * this.width);
    }

    @Override
    public double calculatePerimeter() {
        return (this.height*2+this.width*2);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
}
