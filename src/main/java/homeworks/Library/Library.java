package homeworks.Library;

public class Library {
    public static void main(String[] args) {

        Author author= new Author("DR. David J. Lieberman", "drdavidlierbman@gmail.com");
        Book book = new Book("MindReader", 2023, author, 39.90);

        System.out.println("Book <" + book.getName() + "> " +
                "(<"+ book.getPrice() + "> RON" + ", by " +
                "<"+author.getName() + ">, "
                + "published in <" +
                book.getYear() + ">");
    }
}
