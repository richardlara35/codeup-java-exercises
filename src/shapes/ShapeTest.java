package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Measureable myShape = new Square(5);
        System.out.println("Area " + myShape.getArea());
        System.out.println("Perimeter " + myShape.getPerimeter());

        Measureable box1 = (Measureable) new Rectangle(10,9);
        System.out.println("Area" + box1.getArea());
        System.out.println("Perimeter" + box1.getPerimeter());
    }
}
