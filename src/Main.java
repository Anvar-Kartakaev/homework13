public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №13\n");

        // Task - created Reference book
        // Book #1
        System.out.println("Первая книга:");
        Author person = new Author("John", "Wayne");
        Book book = new Book("Book #1", person, 1999);
        if (book.checkYear()) {
            printCheckYear();
        } else {
            System.out.println(book.toString());
        }


        //Book #2
        System.out.println("\nВторая книга:");
        Author personTwo = new Author("Tomas", "Anderson");
        Book bookTwo = new Book("Book #2", personTwo, 2000);
        if (bookTwo.checkYear()) {
            printCheckYear();
        } else if (book.equals(bookTwo)) {
            printCheckBook();
        } else if (person.equals(personTwo)) {
            printCheckAuthor();
        } else {
            System.out.println(bookTwo.toString());
        }


        //Edit publisher from Book #2
        System.out.println("\nВторая книга - изменил год публикации:");
        bookTwo.setPublisher(2024);
        if (bookTwo.checkYear()) {
            printCheckYear();
        } else {
            System.out.println(bookTwo.toString());
        }

    }

    //Methods
    public static void printCheckYear() {
        System.out.println("Год публикации указан некорректно!"); // Когда год указан с отрицательным значением
    }

    public static void printCheckBook() {
        System.out.println("Такая книга уже существует!"); // Когда у двух книг все поля одинаковые
    }

    public static void printCheckAuthor() {
        System.out.println("Такой автор уже существует!"); // Когда одинаковые авторы
    }

}