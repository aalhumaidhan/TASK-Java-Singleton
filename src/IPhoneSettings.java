public class IPhoneSettings {
    private static IPhoneSettings instance;
    private int brightness;
    private boolean WiFi;
    private IPhoneSettings() {
        brightness = 100;
        WiFi = true;
    }
    public static IPhoneSettings getInstance() {
        if (instance == null) {
            instance = new IPhoneSettings();
        }
        return instance;
    }

    public void setBrightness(int brightness) {
        if (brightness <= 100 && brightness >= 0) {
            this.brightness = brightness;
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public void enableWIFI() {
        this.WiFi = true;
    }

    public void disableWIFI() {
        this.WiFi = false;
    }

    @Override
    public String toString() {
        return "IPhone Object Settings{" +
                "brightness=" + brightness +
                ", WiFi=" + WiFi +
                '}';
    }
}
