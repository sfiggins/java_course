package chapter6;

public class Rectangle {

    // fields
    private double length;
    private double width;

    // default constructor (note no method variables
    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        /*
         * We can use this.length and this.width, or
         * we can use our setter methods. Both examples follow.
         */
        this.length = length;
        setWidth(width);
    }

    // getters and setters
    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    // Rectangle methods
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
