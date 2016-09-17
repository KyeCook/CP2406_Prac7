package Talk_Alot_Phones;

/**
 * Created by ACfan on 17/09/2016.
 */
public class IncomingPhoneCall extends PhoneCall {

    public double CALLRATE = 0.02;

    public IncomingPhoneCall(String number)
    {
        super(number);
        price = CALLRATE;
    }

    public void getInformation()
    {
        System.out.println("Phone call is incoming from " + getNumber() + " at a rate of $" + CALLRATE + " per call." +
        " Total cost is $" + getPrice());
    }

    public String getNumber()
    {
        return number;
    }
    public double getPrice()
    {
        return price;
    }
}
