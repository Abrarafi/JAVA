
import java.util.*;
class Library{
        ArrayList<String> books=new ArrayList<String>();
        ArrayList<String> issuedBooks=new ArrayList<String>();
        public void addBook(String bookTitle)
        {
            books.add(bookTitle);
        }
        public void issueBook(String bookTitle)
        {
            issuedBooks.add(bookTitle);
            books.remove(bookTitle);
        }
        public void returnBook(String bookTitle)
        {
            issuedBooks.remove(bookTitle);
            books.add(bookTitle);
        }
        public void displayAvailableBooks()
        {
            Collections.sort(books);
            for(String i:books)System.out.println(i);
        }
        public void displayIssuedBooks()
        {
            Collections.sort(issuedBooks);
            for(String i:issuedBooks)System.out.println(i);
        }

    }
public class a2p2
{
    
    public static void main(String args[])
    {
        Library library=new Library();
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");

        System.out.println("Available Books: ");
        library.displayAvailableBooks();
        library.issueBook("Book 1");
        System.out.println("\nAvailable Books: ");
        library.displayAvailableBooks();
        System.out.println("\nIssued Books: ");
        library.displayIssuedBooks();
        library.returnBook("Book 1");
        System.out.println("\nAvailable Books: ");
        library.displayAvailableBooks();
        System.out.println("\nIssued Books: ");
        library.displayIssuedBooks();

    }
}