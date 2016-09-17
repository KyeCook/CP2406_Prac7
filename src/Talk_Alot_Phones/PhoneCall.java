package Talk_Alot_Phones;

/**
 * Created by Kye_Cook on 15/09/2016.
 */
public abstract class PhoneCall {
    String number;
    double price;

    public PhoneCall(String phoneNumber)
    {
        number = phoneNumber;
        price = 0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getNumber();

    public abstract double getPrice();

    public abstract void getInformation();
}
