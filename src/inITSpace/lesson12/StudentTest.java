package inITSpace.lesson12;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student("Poxos", "Poxosyan", 23, "098777888", "Java");

        System.out.println(student.getName());
        student.setName("Poxosik");
        System.out.println(student.getName());
    }
}