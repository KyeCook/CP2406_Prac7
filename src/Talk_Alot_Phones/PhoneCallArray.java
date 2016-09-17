package Talk_Alot_Phones;

/**
 * Created by ACfan on 17/09/2016.
 */
public class PhoneCallArray {
    public static void main(String[] args)
    {
        PhoneCall calls[] = new PhoneCall[10];

        calls[0] = new IncomingPhoneCall("0411 111 111");
        calls[1] = new IncomingPhoneCall("0422 222 222");
        calls[2] = new IncomingPhoneCall("0433 333 333");
        calls[3] = new IncomingPhoneCall("0444 444 444");
        calls[4] = new IncomingPhoneCall("0455 555 555");
        calls[5] = new OutgoingPhoneCall("0466 666 666", 1);
        calls[6] = new OutgoingPhoneCall("0466 666 666", 2);
        calls[7] = new OutgoingPhoneCall("0466 666 666", 3);
        calls[8] = new OutgoingPhoneCall("0466 666 666", 4);
        calls[9] = new OutgoingPhoneCall("0466 666 666", 5);

        for(int x = 0; x < calls.length; ++x)
        {
            System.out.println("Call with number: " + calls[x].getNumber() + " has a total cost of $" + calls[x].getPrice());
        }
    }
}
