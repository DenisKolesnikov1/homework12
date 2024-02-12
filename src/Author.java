import java.util.Objects;

public class Author {

    private String firstName;
    private String lastName;
    private int year;

    public Author() {
    }

    public Author(String firstName) {
        this.firstName = firstName;
    }

    public Author(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return year == author.year && Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, year);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Author{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", year=" + year +
                '}';
    }
}
