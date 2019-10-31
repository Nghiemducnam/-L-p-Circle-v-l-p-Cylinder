package shape.org;

public class Circle {
    private double radius = 2.0;
    private String color = "green";

    public  Circle(){

    }

   public Circle(double radius, String color) {
       this.radius = radius;
       this.color = color;

   }
   public double getRadius() {

       return radius;
   }
   public String getColor() {

       return color;
   }
   public  void setColor(String newColor) {

       this.color = newColor;
   }
   public void setRadius(double newRadius){

       this.radius = newRadius;
   }

   public double getArea() {

       return radius*radius*Math.PI;
   }

   @Override
    public String toString(){
       return "radius is: " + getRadius()
                            + "the Area is: "
                            + getArea()
                            + "the color is: "
                            +getColor()
                            + "the Area is:" + getArea();

   }
}
