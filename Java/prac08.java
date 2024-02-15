public class prac08 {

    private int num = 10;

    public void printValue() {
        System.out.println("Value using this: " + this.num);

        int num = 20;
        System.out.println("Local variable value: " + num);
        System.out.println("Instance variable value: " + this.num);
    }

    public prac08 anotherMethod(int newValue) {
        this.printValue();

        this.num = newValue;
        System.out.println("Modified value: " + this.num);

        return this;
    }
    public static void main(String[] args) {
        prac08 obj = new prac08();
        obj.printValue(); 

        obj.anotherMethod(30); 

        System.out.println("Value after anotherMethod: " + obj.num);
    }
}