package shape.org;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.0, "red");
        System.out.println(circle);


        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);


        cylinder = new Cylinder(1.0, "blue",6);
        System.out.println(cylinder);
    }

}
