package Classes;
import java.util.ArrayList;
import java.util.List;


// Library class represents the library itself
public class Library {
    private List<Book> books;
    private List<Member> members;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Remove a book from the library
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Add a member to the library
    public void addMember(Member member) {
        members.add(member);
    }

    // Remove a member from the library
    public void removeMember(Member member) {
        members.remove(member);
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Book ID: " + book.getBookId());
        }
    }

    // Display all members of the library
    public void displayMembers() {
        System.out.println("Members of the library:");
        for (Member member : members) {
            System.out.println("Name: " + member.getName() + ", Member ID: " + member.getMemberId());
        }
    }
}
