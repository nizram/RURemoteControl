package projectorapp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * CFReader reads and stores the contents of a configuration file.
 * 
 * This code was adapted from The TrajGUI project for Rowan University in 2005.
 * The contributers of the the original project are: Chris Clement,
 * Peter Flanner, Dan Marzin, Josh Ogren, and Andrew Tasso.
 * 
 * @author marzin
 * @version 0.1
 */
public class CFReader 
{

    //Bufferedreader used to get the contents of the config files
    private static BufferedReader dataIn;
    //String to hold the contents of the config file
    private String fileData;
    
    /**
     * Creates a CFReader with the path to the specified config file
     * 
     * @param filePath the path to the config file which is to be read
     */
    public CFReader(String filePath)
    {
            
        //Try for reading the file
        try
        {
            //Create a new fileinputstream with the specified path
            FileInputStream in = new FileInputStream(filePath);
            //obtain the buffered reader from the fileinputstram
            dataIn = new BufferedReader(new InputStreamReader(in));
            
            //read the first line of the config file
            String line = dataIn.readLine();
            //initialize the string to hold the contents of the config file
            fileData = new String();
            
            //loop through the config file until there are no more lines
            //to read
            while ( line != null )
            {
                //add the contents of the line read from the file to 
                //the string containing the contents
                fileData = fileData + line + "\n";
                //read a new line from the file
                line = dataIn.readLine();
            }

            //close the bufferedreader
            dataIn.close();
            //close the fileinput stream
            in.close();
        
        }   
        //catch the exception if the file could not be read
        catch(Exception e) 
        {
            //create the error array to be passed to the error dialog
            String errorArray[] = {"Config file could not be read.\n\n",
                                 e.getMessage()};
            //display the error                     
            ErrorDialog.display(null, "Config file read error", errorArray);
            System.err.println(e);
                                
        }
    }
    
    /**
     * Returns the string containing the contents of the config file
     * 
     * @return A string containing the contents of the config file
     */
    public String getFile()
    {
        //return the string containing the contents of the config file
        return fileData;

    } 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Test function to check contents of getFile() fiunction*/
        String file = new String();
        file = new CFReader("/Users/dmarzin/sourcetree/Code/Projects/projectorapp/projectorapp/build/classes/projectorapp/projectors.conf").getFile();
        System.out.println(file);
    }
}