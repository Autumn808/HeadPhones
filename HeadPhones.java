import java.awt.Color;
import java.lang.String;

enum VolumeLevel {LOW, MEDIUM, HIGH}

/**
 * Autumn Capasso
 * UMUC
 * CMIS 141
 * Homework 3
 */

//Headphones Class
public class HeadPhones {


    private Color headPhonesColor;
    private String manufacturer;
    private String headPhonesModel;


    private VolumeLevel volume = VolumeLevel.MEDIUM;
    private boolean pluggedIn = false;

    //Constructor
    public HeadPhones() {
    }

    public HeadPhones(Color headPhonesColor, String manufacturer, String headphonesModel, VolumeLevel volumeLevel) {
        this.volume = volumeLevel;
        this.headPhonesModel = headPhonesModel;
        this.manufacturer = manufacturer;
        this.headPhonesColor = headPhonesColor;
    }

    public String toString() {
        String headPhonesDescription = "" +
                "(volume: " + volume + ", " +
                "HeadphonesModel: " + headPhonesModel + ", " +
                "Manufaturer: " + manufacturer + ", " +
                "Color: " + headPhonesModel + ")";
        return headPhonesDescription;
    }

    // Getter methods
    public VolumeLevel getVolume() {
        return volume;
    }

    public String getHeadPhoneModel() {
        return headPhonesModel;
    }

    public String getHeadPhonesManufacturer() {
        return manufacturer;
    }

    public Color getheadphonesColor() {
        return headPhonesColor;
    }
}