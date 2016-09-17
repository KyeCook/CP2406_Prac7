package Books;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by jc319912 on 12/09/16.
 */
public abstract class Book {
    String title = new String();
    double price;

    public Book(String bookTitle)
    {
        title = bookTitle;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public abstract void setPrice();
}
