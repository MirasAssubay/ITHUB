package OOP2;

import java.util.Arrays;

public class BookAdvanced {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public BookAdvanced(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public BookAdvanced(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "BookAdvanced{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames() {
        return Arrays.toString(authors);
    }
}
