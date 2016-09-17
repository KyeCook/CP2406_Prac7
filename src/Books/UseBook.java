package Books;

/**
 * Created by Kye_Cook on 15/09/2016.
 */
public class UseBook {
    public static void main(String[] args)
    {
        Fiction book1 = new Fiction("A very interesting Novel");
        NonFiction book2 = new NonFiction("The amazing non-fiction book");

        System.out.println("Fiction called " + '"' + book1.getTitle() + '"' + ", and costs $" + book1.getPrice());

        System.out.println("Non-Fiction called " + '"' + book2.getTitle() + '"' + ", and costs $" + book2.getPrice());

//        public static void display(Book book)
//    {
//     System.out.println("This book is ");
    }
}
