package interfacesegregationprinciple;

public class Iphone implements Call, Sms, WebBrowsing, Camera {
    @Override
    public void makeCall(String number) {
        System.out.println("Iphone calling " + number);
    }

    @Override
    public void sendSms(String number, String message) {
        System.out.println("Iphone sending SMS to " + number + ": " + message);
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("Iphone browsing: " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("Iphone taking a picture.");
    }
}