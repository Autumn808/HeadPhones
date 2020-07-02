import java.awt.Color;
import java.lang.String;
/**
 *
 * Autumn Capasso
 * UMUC
 * CMIS 141
 *Homework
 *HeadPhones Class Assignment
 **/

//HeadPhones test class
public class HeadPhonesTest {

    public static void main(String args[]) {

        HeadPhones headPhonesTest1 = new HeadPhones(Color.GRAY, "Apple", "Pro", VolumeLevel.MEDIUM);
        System.out.println("toString(): " + headPhonesTest1.toString());
        System.out.println("getheadphonesColor(): " + headPhonesTest1.getheadphonesColor());
        System.out.println("getmanufacturer(): " + headPhonesTest1.getHeadPhonesManufacturer());
        System.out.println("getheadphonesModel(): " + headPhonesTest1.getHeadPhoneModel());
        System.out.println("getVolumeLevel(); " + headPhonesTest1.getVolume());



        HeadPhones headPhonesTest2 = new HeadPhones(Color.magenta, "Boise", "Fancy", VolumeLevel.MEDIUM);
        System.out.println("toString(): " + headPhonesTest2.toString());
        System.out.println("getheadphonesColor(): " + headPhonesTest2.getheadphonesColor());
        System.out.println("getmanufacturer(): " + headPhonesTest2.getHeadPhonesManufacturer());
        System.out.println("getheadphonesModel(): " + headPhonesTest2.getHeadPhoneModel());
        System.out.println("getVolumeLevel(); " + headPhonesTest2.getVolume());

        HeadPhones headPhonesTest3 = new HeadPhones(Color.PINK, "Beats", "Bluetooth", VolumeLevel.MEDIUM);
        System.out.println("toString(): " + headPhonesTest3.toString());
        System.out.println("getheadphonesColor(): " + headPhonesTest3.getheadphonesColor());
        System.out.println("getmanufacturer(): " + headPhonesTest3.getHeadPhonesManufacturer());
        System.out.println("getheadphonesModel(): " +headPhonesTest3.getHeadPhoneModel());
        System.out.println("getVolumeLevel(); " + headPhonesTest3.getVolume());

    }
}

