public class prac10 {

    private static int counter = 0;

    private final String name;

    public prac10(String name) {
        this.name = name;
        counter++; 
    }

    public static int getCounter() {
        return counter;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Total objects: " + getCounter());
    }

    public static void main(String[] args) {
        prac10 obj1 = new prac10("Het");
        prac10 obj2 = new prac10("Jatin");
        prac10 obj3 = new prac10("Rishabh");

        System.out.println("Total objects (static): " + getCounter());

        obj1.printInfo();
        obj2.printInfo();
        obj3.printInfo();
    }
}
