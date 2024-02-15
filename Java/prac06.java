public class prac06 {
    private int enrollmentNo;
    private String name;

    public void getInfo(int enrollmentNo, String name) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        prac06 student1 = new prac06();
        prac06 student2 = new prac06();
        prac06 student3 = new prac06();

        student1.getInfo(7070, "Het");
        student2.getInfo(7073, "Jatin");
        student3.getInfo(7013, "Rishabh");

        System.out.println("Student 1 name: " + student1.getName());
        System.out.println("Student 2 name: " + student2.getName());
        System.out.println("Student 3 name: " + student3.getName());
    }
}