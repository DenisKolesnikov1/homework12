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

        int m = 8;
        int a = 8;
        if (m == a) {
            System.out.println("они равны");
        }

        if (author.equals(author1)) {
            System.out.println("объекты равны");
        } else {
            System.out.println("объекты не равны");
        }

        System.out.println(author.hashCode());
        System.out.println(author.hashCode());
        System.out.println(author.hashCode());

    }
}