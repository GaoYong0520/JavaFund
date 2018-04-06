package mvc;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student student, StudentView view) {
        this.model = student;
        this.view = view;
    }

    public Student getModel() {
        return model;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollno) {
        model.setRollNo(rollno);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        view.printStudent(model.getName(),model.getRollNo());
    }
}
