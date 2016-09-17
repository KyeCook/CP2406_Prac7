package Talk_Alot_Phones;

/**
 * Created by ACfan on 17/09/2016.
 */
public class OutgoingPhoneCall extends PhoneCall{

    public double CALLRATE = 0.04;
    private int callMinutes;

    public OutgoingPhoneCall(String number, int minutes)
    {
        super(number);
        callMinutes = minutes;
        price = minutes * CALLRATE;
    }

    public void getInformation()
    {
        System.out.println("Phone call is incoming from " + getNumber() + " at a rate of $" + CALLRATE + " per minute." +
                " Total time of call is " + callMinutes + " minutes with a total cost of $" + getPrice());
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
