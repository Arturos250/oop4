public class Main {
    public static void main(String[] args) {
        GeometricShape rectangle = new Rectangle(7, 3);
        GeometricShape circle = new Circle(20.3);
        circle.calculatePerimeter();
        circle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.calculateArea();
    }
}
