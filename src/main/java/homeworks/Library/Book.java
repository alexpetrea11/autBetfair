package homeworks.Library;

public class Book {
    public String name;
    public int year;
    public Author author;
    public double price;

    public Book(String name, int year, Author author, double price){
        this.name=name;
        this.year=year;
        this.author=author;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
