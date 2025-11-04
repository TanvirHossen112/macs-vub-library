import java.util.ArrayList;
import java.util.Collection;

public class User {

    private String name;
    private String phone;
    private Collection<Book> booksInHand = new ArrayList<>();

    /**
     * Constructs a new User with the specified name and phone number.
     *
     * @param String name
     * @param String phone
     */
    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    /**
     * Returns the name of the user.
     *
     * @return String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the phone number of the user.
     *
     * @return String
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Adds a book to the user's collection of borrowed books.
     *
     * @param Book book
     *
     * @return void
     */
    public void addBook(Book book) {
        booksInHand.add(book);
    }

    /**
     * Removes a book from the user's collection of borrowed books.
     *
     * @param Book book
     *
     * @return void
     */
    public void removeBook(Book book) {
        booksInHand.remove(book);
    }

    /**
     * Displays the list of books currently borrowed by the user.
     *
     * @return void
     */
    public void getBooksInHandList() {
        System.out.println(this.name + " books list: ");
        int i = 0;
        for (Book book : booksInHand) {
            System.out.println(++i + ". " + book.getTitle());
        }
    }

    /**
     * Returns the number of books currently borrowed by the user.
     *
     * @return int
     */
    public int getBooksInHandCount() {
        return this.booksInHand.size();
    }
}
