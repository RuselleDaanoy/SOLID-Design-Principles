package interfacesegregationprinciple;

public class TestISP {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.makeCall("09222222222");
        basicPhone.sendSms("09222222222", "This is Spam!");

        Samsung samsung = new Samsung();
        samsung.browseWeb("www.github.com");
        samsung.takePicture();

        Iphone iphone = new Iphone();
        iphone.makeCall("09222222222");
        iphone.takePicture();
    }
}
