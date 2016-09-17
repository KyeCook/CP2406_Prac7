package Books;

/**
 * Created by Kye_Cook on 15/09/2016.
 */
public class BookArray {
    public static void main(String[] args)
    {
        Book books[] = new Book[10];

        books[0] = new Fiction("Fict1");
        books[1] = new Fiction("Fict2");
        books[2] = new Fiction("Fict3");
        books[3] = new Fiction("Fict4");
        books[4] = new Fiction("Fict5");
        books[5] = new NonFiction("Non-Fict1");
        books[6] = new NonFiction("Non-Fict2");
        books[7] = new NonFiction("Non-Fict3");
        books[8] = new NonFiction("Non-Fict4");
        books[9] = new NonFiction("Non-Fict5");

        for(int x = 0; x < books.length; ++x)
            System.out.println("Book: " + '"' + books[x].getTitle() + '"' + ", has a cost of $" + books[x].getPrice());
    }
}
