// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
import Classes.*;

public class App {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryLoader loader = new LibraryLoader(library);

        // Load books from CSV
        String booksCSVFile = "books.csv"; // Assuming the CSV file contains book data
        loader.loadBooksFromCSV(booksCSVFile);

        // Load members from CSV
        String membersCSVFile = "members.csv"; // Assuming the CSV file contains member data
        loader.loadMembersFromCSV(membersCSVFile);

        // Display books and members
        library.displayBooks();
        System.out.println();
        library.displayMembers();
    }
}

