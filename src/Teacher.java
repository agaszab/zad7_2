public class Teacher extends Person {

    private int salary;   // wypłata
    private String classTeacher;

    public Teacher(String firstName, String lastName, int salary, String classTeacher) {
        super(firstName, lastName);
        this.salary = salary;
        this.classTeacher = classTeacher;
    }

    public Teacher() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    void show() {

        super.show();
        System.out.println("Wynagrodzenie: " + getSalary());
        System.out.println("Wychowawstwo w: " + getClassTeacher());
    }

}
