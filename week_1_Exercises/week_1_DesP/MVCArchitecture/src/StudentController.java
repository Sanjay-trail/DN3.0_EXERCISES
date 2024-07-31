public class StudentController {
    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public void updateStudentName(String name) {
        student.setName(name);
    }

    public void updateStudentGrade(String grade) {
        student.setGrade(grade);
    }

    public void displayStudent() {
        studentView.displayStudentDetails(student.getName(), student.getId(), student.getGrade());
    }
}
