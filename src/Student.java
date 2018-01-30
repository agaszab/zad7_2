public class Student extends Person {

    private String fieldOfStudy;

    public Student(String firstName, String lastName, String fieldOfStudy) {

        super(firstName, lastName);
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    void show() {
        super.show();
        System.out.println("Kierunek studiów: " + getFieldOfStudy());
    }


}
