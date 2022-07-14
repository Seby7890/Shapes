public class Canvas {
    public static void main(String[] args) {
        Circle circle = new Circle(3.4);
        Rectangle rectangle = new Rectangle(2.3,5.6);

        System.out.println("Circle area is: " + circle.computeArea());
        System.out.println("Rectangle area is: " + rectangle.computeArea());
    }
}
