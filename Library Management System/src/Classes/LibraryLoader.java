package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LibraryLoader {
    private Library library;

    public LibraryLoader(Library library) {
        this.library = library;
    }

    /**
     * Format: Book Name, Title, author
     * @param filename is a csv file
     */
    public void loadBooksFromCSV(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String title = data[0].trim();
                String author = data[1].trim();
                int bookId = Integer.parseInt(data[2].trim());
                // Create Book object and add it to the library
                library.addBook(new Book(title, author, bookId));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Data Format: Name, MemberId
     * @param filename is the name of the file
     */
    public void loadMembersFromCSV(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0].trim();
                int memberId = Integer.parseInt(data[1].trim());
                // Create Member object and add it to the library
                library.addMember(new Member(name, memberId));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

