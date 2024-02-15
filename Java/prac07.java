public class prac07 {
    private int height;
    private int width;

    public prac07(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public static void main(String[] args) {
        prac07 rectangle1 = new prac07(5, 10);
        System.out.println("Rectangle 1: Height = " + rectangle1.getHeight() + ", Width = " + rectangle1.getWidth());

        prac07 rectangle2 = new prac07(15, 20);
        System.out.println("Rectangle 2: Height = " + rectangle2.getHeight() + ", Width = " + rectangle2.getWidth());
    }
}