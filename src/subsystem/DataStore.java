package subsystem;

import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;

/**
 * Manages a .properites file
 */
public class DataStore
{
    // instance variables - replace the example below with your own
    public Properties props = null;
    private String fileName = "";

    /**
     * Constructor for objects of class DataStore
     */
    public DataStore(String fn)
    {
        this.fileName = fn;
        loadProps();
    }
    
    public void setFileName(String in) {
        this.fileName = in;
        loadProps();
    }
    
    public String getFileName() {
        return this.fileName;
    }
    
    // Only call when the propertes
    public void loadProps(){
        props = new Properties();
        
        InputStream is = null;

        try {
            is = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e);
        }
        try {
            props.load(is);
            is.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
    
    
    // Add to every function that writes to the properties.
     public void saveProps(){
        File configFile = new File(fileName);
        try {
            FileWriter writer = new FileWriter(configFile);
            props.store(writer, "");
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
     }
}
