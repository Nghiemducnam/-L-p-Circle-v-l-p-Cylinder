package shape.org;

public class Cylinder extends Circle {
    private double height = 5.0;

    public  Cylinder(){

    }

    public Cylinder (double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double newHeight){
        this.height = newHeight;
    }
    public double getArea(){
        return Math.PI*getRadius()*getRadius()*this.height;
    }

    @Override
    public String toString() {
        return "radius is:  "
                +getRadius()
                + "V is:"
                +getArea()
                +"the color is"
                + getColor();

    }

}
