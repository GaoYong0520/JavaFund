package mvc;

public class Main {
    public static void main(String[] args) {
        Student model = getStudentData();
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model,view);

        controller.updateView();

        controller.setStudentName("john");

        controller.updateView();

    }

    private static Student getStudentData() {
        Student student = new Student();
        student.setRollNo("001");
        student.setName("mser");
        return student;
    }
}
