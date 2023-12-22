package comparable;

public class Book implements Comparable<Book> {
    private String name;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book() {
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}