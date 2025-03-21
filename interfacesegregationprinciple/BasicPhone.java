package interfacesegregationprinciple;

public class BasicPhone implements Call, Sms {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void sendSms(String number, String message) {
        System.out.println("Sending SMS to " + number + ": " + message);
    }
}
