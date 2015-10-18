public class HW06_P2 {

    public static void main(String[] args) {
        GeometricObject []shapes = {
                new Circle(1),
                new Circle(1),
                new Rectangle(1,1),
                new Rectangle(1,1)
        };

        System.out.println("The sum of areas are: "+sumArea(shapes));

    }

    public static double sumArea(GeometricObject[] a)
    {
        double sum = 0;
        for (int i = 0; i< a.length;i++)
        {
           sum+=a[i].getArea();
        }
        return sum;
    }
}

/*

Analysis:
    The problem asks us to Write a method that sums the areas of all the geometric objects in an array using a specific signature. There is no user input
    and the program has the output of the sum of all areas.
Design:
    The biggest steps in this problem is to create a geometricObject class and a circle and rectalngle class also. The circle and reactangle classes will have
    a unique getarea method. This method is called in the main method which sums all of the ares in the array. The array is created in the main method also.
Testing:
    Test the program with multiple rectangles and circle values. I used multiple values such as (1),(1,1),(10,10),(5,5). Then add the areas up and see if the area sum
    matches the actual sum.


 */
