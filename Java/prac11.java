public class prac11 {

    public static void main(String[] args) {
        float radius = 5.0f;
        System.out.println("Area of circle with radius " + radius + ": " + area(radius));

        float length = 8.0f;
        float width = 6.0f;
        System.out.println("Area of rectangle with length " + length + " and width " + width + ": " + area(length, width));
    }

    public static float area(float radius) {
        return (float) Math.PI * radius * radius;
    }

    public static float area(float length, float width) {
        return length * width;
    }
}
