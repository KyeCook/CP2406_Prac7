package Books;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by jc319912 on 12/09/16.
 */
public class Book {
    private String title;
    private double price;

    public Book(String bookTitle, double bookPrice)
    {
        title = bookTitle;
        price = bookPrice;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
// TODO research how to do abstracts
//    public abstract double setPrice(double price)
//    {
//        this.price = price;
//    }
}
