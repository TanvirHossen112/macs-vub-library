void main() {
    Library library = new Library();

    Book book1 = new Book("Pirates of the Caribbean");
    Book book2 = new Book("Harry Potter and the Philosopher's Stone");
    Book book3 = new Book("The Alchemist");
    Book book4 = new Book("Lord of the Rings");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(book4);

    library.getBookList();

    User user1 = new User("Yavor Nikola", "465351154");

    library.borrowBook(user1, book1);
    library.borrowBook(user1, book3);

    library.getUserBookList(user1);
    library.getUserBookCount(user1);
    library.getUserList();

    library.getBookList();

    library.returnBook(user1, book1);

    library.getUserBookList(user1);
    library.getUserBookCount(user1);

    library.getBookList();

    System.out.println("-----------------------------");
    User user2 = new User("John Doe", "4892133231");
    library.borrowBook(user2, book3);
}
