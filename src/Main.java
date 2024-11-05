public class Main {
    public static void main(String[] args) {
        IPhoneSettings iphone = IPhoneSettings.getInstance();
        iphone.setBrightness(65);
        iphone.disableWIFI();

        System.out.println(iphone.toString());
    }
}