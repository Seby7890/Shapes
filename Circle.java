public class Circle implements Shape, Resizable {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    @Override
    public void resize(double percent) {
        radius = radius * (percent / 100);
    }
}
