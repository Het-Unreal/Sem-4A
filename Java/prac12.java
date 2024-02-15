public class prac12 {
    String name;
    int age;

    public prac12() { this.name = "Unknown"; this.age = 0; }
    public prac12(String name) { this.name = name; this.age = 0; }
    public prac12(String name, int age) { this.name = name; this.age = age; }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        prac12 p1 = new prac12();
        prac12 p2 = new prac12("Alice");
        prac12 p3 = new prac12("Bob", 30);
        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
