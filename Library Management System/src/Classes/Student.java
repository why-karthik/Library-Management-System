package Classes;

public class Student extends Member {
    private String studentId;

    // Constructor
    public Student(String name, int memberId, String studentId) {
        super(name, memberId);
        this.studentId = studentId;
    }

    // Getter for student ID
    public String getStudentId() {
        return studentId;
    }

    public String memType(){
        return "Student";
    }
}
