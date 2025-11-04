import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private HashMap<Book, Boolean> bookList = new HashMap<>();
    private ArrayList<User> users = new ArrayList<>();

    /**
     * Adds a new book to the library's collection.
     *
     * @param Book book
     * @return void
     */
    public void addBook(Book book) {
        if (bookList.containsKey(book)) {
            System.out.println("Sorry, that book is already in the library.");
            return;
        }
        bookList.put(book, true);
    }

    /**
     * Allows a user to borrow a book from the library.
     *
     * @param User user
     * @param Book book
     * @return void
     */
    public void borrowBook(User user, Book book) {
        if (!bookList.get(book)) {
            System.out.println("Sorry, that book is not available.");
            return;
        }
        user.addBook(book);
        bookList.put(book, false);
        if (!users.contains(user)) {
            users.add(user);
        }
    }

    /**
     * Processes the return of a borrowed book from a user.
     *
     * @param User user
     * @param Book book
     * @return void
     */
    public void returnBook(User user, Book book) {
        user.removeBook(book);
        bookList.put(book, true);
        if (user.getBooksInHandCount() == 0) {
            users.remove(user);
        }
    }

    /**
     * Displays the list of all books in the library with their availability status.
     */
    public void getBookList() {
        for (Book book : bookList.keySet()) {
            System.out.println(book.getTitle() + ", Availability: " + bookList.get(book));
        }
    }

    /**
     * Displays the list of books currently borrowed by a specific user.
     *
     * @param User user
     * @return void
     */
    public void getUserBookList(User user) {
        user.getBooksInHandList();
    }

    /**
     * Displays the number of books currently borrowed by a specific user.
     *
     * @param User user
     * @return void
     */
    public void getUserBookCount(User user) {
        System.out.println(user.getName() + " books count: " + user.getBooksInHandCount());
    }

    /**
     * Displays the list of all users currently having books borrowed from the library.
     *
     * @return void
     */
    public void getUserList() {
        for (User user : users) {
            System.out.println(user.getName() + ", Books in Possession: " + user.getBooksInHandCount() + ", Phone: " + user.getPhone());
        }
    }
}
