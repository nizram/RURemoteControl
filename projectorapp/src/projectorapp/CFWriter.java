package projectorapp;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;

/**
 * CFWriter
 *
 * @author marzin
 * @version 0.1
 */
public class CFWriter
{
    //BufferedWriter used to write the contents of the config file
    private static BufferedWriter dataOut;
    //String to hold the contents of the config file
    private String fileData;
    //Create a new FileOutputStream with the specified path
    private FileOutputStream out;
    
    public CFWriter(String filePath)
    {
        //Try for writing the file
        try
        {
            //Create a new FileOutputStream with the specified path
            out = new FileOutputStream(filePath);
            //obtain the BufferedWriter from the FileOutputStream
            dataOut = new BufferedWriter(new OutputStreamWriter(out));
        }
        //catch the exception if the file could not be written
        catch(Exception e)
        {
            //create the error array to be passed to the error dialog
            String errorArray[] = {"Config file could not be written.\n\n",
                                    e.getMessage()};
            //display the error
            ErrorDialog.display(null, "Config file write error", errorArray);
        }
    }
    
    public void writeConf(HashMap<String, Configuration> map)
    {
        StringBuilder config = new StringBuilder();
        //write the first line of the config file
        for (Configuration value : map.values())
        {
            config.append(value.getConfigString());
        }
        
        try
        {
            dataOut.write(config.toString());
        }
        //catch the exception if the file could not be written
        catch(Exception e)
        {
            //create the error array to be passed to the error dialog
            String errorArray[] = {"Config file could not be written.\n\n",
                                    e.getMessage()};
            //display the error
            ErrorDialog.display(null, "Config file write error", errorArray);
        }
    }
    
    public void close()
    {
        //Try for writing the file
        try
        {
            //close the BufferedWriter
            CFWriter.dataOut.close();
            //close the FileOutputStream
            this.out.close();
        }
        //catch the exception if the file could not be written
        catch(Exception e)
        {
            //create the error array to be passed to the error dialog
            String errorArray[] = {"Config file could not be written.\n\n",
                                    e.getMessage()};
            //display the error
            ErrorDialog.display(null, "Config file write error", errorArray);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Test function to check contents of getFile() fiunction*/
        String filepath;
        String file = new String();
        InetAddress ip = null;
        try
        {
            ip = InetAddress.getByName("0.0.0.0");
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        Configuration conf = new Configuration("TEST", "Projector", "NEC", "NP1000", 9600, 8, "N", 1, false, ip,
                                               "PC","LAPTOP","","","");
        Configuration conf2 = new Configuration("TEST2", "Projector", "NEC", "NP1000", 9600, 8, "N", 1, false, ip,
                                                "PC","LAPTOP","","","");
        HashMap<String, Configuration> map = new HashMap<String, Configuration>();
        map.put(conf.getTitle(), conf);
        map.put(conf2.getTitle(), conf2);
        filepath = "/Users/dmarzin/sourcetree/Code/Projects/projectorapp/projectorapp/build/classes/projectorapp/projectors.conf";
        CFWriter write = new CFWriter(filepath);
        write.writeConf(map);
        write.close();
        file = new CFReader(filepath).getFile();
        System.out.println(file);
    }
}