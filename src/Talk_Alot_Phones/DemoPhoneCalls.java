package Talk_Alot_Phones;

/**
 * Created by ACfan on 17/09/2016.
 */
public class DemoPhoneCalls {
    public static void main(String[] args)
    {
        IncomingPhoneCall call_1 = new IncomingPhoneCall("0409 099 090");
        OutgoingPhoneCall call_2 = new OutgoingPhoneCall("0499 999 999", 8);

        System.out.println("Call with number '" + call_1.getNumber() + "' has a costing of $" + call_1.getPrice());
        System.out.println("Call with number '" + call_2.getNumber() + "' has a costing of $" + call_2.getPrice());

    }
}
