package Classes;

// Faculty class represents a faculty member of the library
public class Faculty extends Member {
    private String department;

    // Constructor
    public Faculty(String name, int memberId, String department) {
        super(name, memberId);
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    public String memType(){
        return "Faculty";
    }
}
