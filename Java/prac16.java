class Shape {
    private int color;

    public Shape(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void printDetails() {
        System.out.println("Color: " + color);
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Shape: Rectangle");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(int color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }
}

public class prac16 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 5, 10);
        Circle circle = new Circle(2, 3.0);

        rectangle.printDetails();
        circle.printDetails();
    }
}
