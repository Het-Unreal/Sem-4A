public class prac09 {

    private static int counter = 0;

    private final String name;

    public prac09(String name) {
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
        prac09 obj1 = new prac09("Het");
        prac09 obj2 = new prac09("Jatin");
        prac09 obj3 = new prac09("Rishabh");

        System.out.println("Total objects (static): " + getCounter());

        obj1.printInfo();
        obj2.printInfo();
        obj3.printInfo();
    }
}
