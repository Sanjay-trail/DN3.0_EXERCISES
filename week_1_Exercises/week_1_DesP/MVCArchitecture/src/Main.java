public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 1, "A");
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);

        studentController.displayStudent();

        studentController.updateStudentName("Jane Smith");
        studentController.updateStudentGrade("B");

        studentController.displayStudent();
    }
}
