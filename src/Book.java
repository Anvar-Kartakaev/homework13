public class Book {
    private String title;
    private Author author;
    private int publisher;

    public Book(String title, Author author, int publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublisher() {
        return publisher;
    }

    public void setPublisher(int publisher) {
        this.publisher = publisher;
    }

    public boolean checkYear() {
        return publisher < 0; // Проверка на корректность года, чтобы не было значений с минусом
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Book otherBook = (Book) other;
        return title.equals(otherBook.title) && author.equals(otherBook.author) && publisher == (otherBook.publisher);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getTitle(), getAuthor(), getPublisher());
    }

    @Override
    public String toString() {
        return "Книга '" + getTitle() + "', опубликована в " + getPublisher() + " году. Автор: " + getAuthor();
    }
}