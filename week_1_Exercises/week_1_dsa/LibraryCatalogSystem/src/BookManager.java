import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookManager {
    public static Book linearSearch(ArrayList<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearch(ArrayList<Book> books, String title) {
        int left = 0;
        int right = books.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (books.get(mid).getTitle().equalsIgnoreCase(title)) {
                return books.get(mid);
            }
            if (books.get(mid).getTitle().compareToIgnoreCase(title) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(2, "1984", "George Orwell"));
        books.add(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));

        Book foundBookLinear = linearSearch(books, "1984");
        if (foundBookLinear != null) {
            System.out.println("Found Book (Linear Search): " + foundBookLinear);
        } else {
            System.out.println("Book not found (Linear Search).");
        }

        Collections.sort(books, Comparator.comparing(Book::getTitle));
        Book foundBookBinary = binarySearch(books, "1984");
        if (foundBookBinary != null) {
            System.out.println("Found Book (Binary Search): " + foundBookBinary);
        } else {
            System.out.println("Book not found (Binary Search).");
        }
    }
}
