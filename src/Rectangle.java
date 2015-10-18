/**
 * Created by Sai Gatram on 10/15/2015.
 */
public class Rectangle extends GeometricObject{
    double length;
    double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (length*width);
    }
}
