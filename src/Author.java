public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Author otherAuthor = (Author) other;
        return name.equals(otherAuthor.name) && surname.equals(otherAuthor.surname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getName(), getSurname());
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }

}