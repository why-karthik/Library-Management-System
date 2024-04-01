package Classes;
// Member class represents a library member
public class Member {
    private String name;
    private int memberId;

    // Constructor
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
}

