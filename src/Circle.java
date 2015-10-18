/**
 * Created by Sai Gatram on 10/15/2015.
 */
public class Circle extends GeometricObject {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI*Math.pow(radius,2));
    }
}
