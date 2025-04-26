import java.util.Scanner;

interface l {
    void addBook(String book);      // accepts book name
    void issuedBooks();
    void returnBook(String book);   // accepts book name
    void AvailableBooks();
}

class Il implements l {
    String[] aBook = new String[100];
    String[] issued = new String[100];
    int availableB = 0;
    int issuedCount = 0;

    public void addBook(String book) {
        aBook[availableB] = book;
        availableB++;
        System.out.println("Book \"" + book + "\" has been added.");
    }

    public void issuedBooks() {
        System.out.println("Issued books:");
        for (int i = 0; i < issuedCount; i++) {
            if (issued[i] != null)
                System.out.println("* " + issued[i]);
        }
    }

    public void returnBook(String book) {
        boolean found = false;
        for (int i = 0; i < issuedCount; i++) {
            if (issued[i] != null && issued[i].equals(book)) {
                // Remove from issued
                for (int j = i; j < issuedCount - 1; j++) {
                    issued[j] = issued[j + 1];
                }
                issued[--issuedCount] = null;

                // Add back to available
                aBook[availableB++] = book;
                System.out.println("Book \"" + book + "\" returned.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book \"" + book + "\" was not issued.");
        }
    }

    public void AvailableBooks() {
        System.out.println("Available books:");
        for (int i = 0; i < availableB; i++) {
            if (aBook[i] != null)
                System.out.println("* " + aBook[i]);
        }
    }

    public void issueBook(String book) {
        boolean found = false;
        for (int i = 0; i < availableB; i++) {
            if (aBook[i] != null && aBook[i].equals(book)) {
                // Remove from available
                for (int j = i; j < availableB - 1; j++) {
                    aBook[j] = aBook[j + 1];
                }
                aBook[--availableB] = null;

                // Add to issued
                issued[issuedCount++] = book;
                System.out.println("Book \"" + book + "\" issued.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book \"" + book + "\" not found.");
        }
    }
}

public class LibrarayTest {
    public static void main(String[] args) {
        Il lib = new Il();
        lib.addBook("JAVA");
        lib.addBook("C++");
        lib.addBook("Python");
        lib.AvailableBooks();
        lib.issueBook("C++");
        lib.AvailableBooks();
        lib.issuedBooks();
        lib.returnBook("C++");
        lib.AvailableBooks();
    }
}
