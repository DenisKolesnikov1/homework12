public class Book {
    private String title;
    private int theYearOfPublishing;
    private Author author;

    public Book(java.lang.String title, int theYearOfPublishing, Author author) {
        this.title = title;
        this.theYearOfPublishing = theYearOfPublishing;
        this.author = author;
    }

    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public int getTheYearOfPublishing() {
        return theYearOfPublishing;
    }

    public void setTheYearOfPublishing(int theYearOfPublishing) {
        this.theYearOfPublishing = theYearOfPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Book book = (Book) object;
        return theYearOfPublishing == book.theYearOfPublishing && java.util.Objects.equals(title, book.title) && java.util.Objects.equals(author, book.author);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), title, theYearOfPublishing, author);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Book{" +
                "title=" + title +
                ", theYearOfPublishing=" + theYearOfPublishing +
                ", author=" + author +
                '}';
    }
}
