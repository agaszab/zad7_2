public class School {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Jan", "Kowalski", 2500, "Va");
        Student student = new Student("Marek", "Wilk", "History");


        System.out.println("Nauczyciel:");
        teacher.show();

        System.out.println();

        System.out.println("Student:");
        student.show();

    }
}
