import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

public class XMLSerialization implements Serializable {
    public static void main(String[] args) {
        final String XML_FILE_NAME = "file.xml";
        encoder(XML_FILE_NAME);
        System.out.println(decoder(XML_FILE_NAME));
    }
    private static Phone decoder(String path){
        FileInputStream fis = null;
        XMLDecoder decoder = null;
        Phone phone = null;
        try{
            fis = new FileInputStream(path);
            decoder = new XMLDecoder(fis);
            phone = (Phone)decoder.readObject();
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            if(decoder != null) {
                try {
                    decoder.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(fis != null) {
                try {
                    fis.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return phone;
    }

    private static void encoder(String path){
        FileOutputStream fos = null;
        XMLEncoder encoder = null;
        Phone currentPhone = new Phone();
        currentPhone.setModel("samsung Galaxy A30");
        currentPhone.setPrice(1500);
        currentPhone.setPhoneBook(new int[] {99141513,41456547,91112233});
        AndroidSystem systemOS = new AndroidSystem();
        systemOS.setVersion("kit-kat");
        currentPhone.setPhoneOS(systemOS);

        try {
            fos = new FileOutputStream(path);
            encoder = new XMLEncoder(fos);

            encoder.writeObject(currentPhone);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(encoder !=null){
                try {
                    encoder.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try{
                    fos.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
