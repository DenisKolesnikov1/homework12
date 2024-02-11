public class Main {
    public static void main(String[] args) {

        Author author = new Author();
        author.setLastName("Пьюзо");
        author.setFirstName("Марио");
        author.setYear(1969);

        Author author1 = new Author("Александр", "Пушкин");

        System.out.println(author);
        System.out.println(author1);

        Book book = new Book("Крёстный отец", 1969, author);
        System.out.println(book);
        System.out.println(book.getTheYearOfPublishing());

        book.setTheYearOfPublishing(1972);

        System.out.println(book.getTheYearOfPublishing());
    }
}