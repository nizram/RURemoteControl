package projectorapp;

import java.net.InetAddress;
import java.util.StringTokenizer;

/**
 * CFSeparator separates and stores the contents of a TrajGUI config file into
 * its respective individual sections.
 * 
 * This code was adapted from The TrajGUI project for Rowan University in 2005.
 * The contributers of the the original project are: Chris Clement,
 * Peter Flanner, Dan Marzin, Josh Ogren, and Andrew Tasso.
 * 
 * @author marzin
 * @author bittner
 * @version 0.1
 */
public class CFSeparator {
     StringTokenizer tokenizer;


    public CFSeparator() {
    }
    
    public void constructConfig(String configString)
    {
     String title = "";
     String type = "";
     String make = "";
     String model = "";
     InetAddress ipAddress;
     int speed = 0;
     int dataBits = 0;
     String parity = "";
     int stopBits = 0;
     boolean tecRoom = false;
     String pc = "";
     String laptop = "";
     String dvd = "";
     String vcr = "";
     String doccam = "";
      
      tokenizer = new StringTokenizer(configString,"\n", false);
      while(tokenizer.hasMoreTokens())
      {
        String token = tokenizer.nextToken();
        StringTokenizer lineTokenizer = new StringTokenizer(token, "=", false);
        String option = lineTokenizer.nextToken().trim().toUpperCase();
        if(option.equals("NAME"))
        {   title = lineTokenizer.nextToken();    
        }
        else if(option.equals("TYPE"))
        {   type = lineTokenizer.nextToken();}
        else if(option.equals("MAKE"))
        {   make = lineTokenizer.nextToken();}
        else if(option.equals("MODEL"))
        {   model = lineTokenizer.nextToken();} 
        else if(option.equals("IPADDRESS"))
        {}
         else if(option.equals("SERIAL"))
        {   StringTokenizer subTokenizer = new StringTokenizer(lineTokenizer.nextToken(), " ", false);
         try {    
            speed = Integer.parseInt(subTokenizer.nextToken());
            dataBits = Integer.parseInt(subTokenizer.nextToken());
            parity = subTokenizer.nextToken();
            stopBits = Integer.parseInt(subTokenizer.nextToken());
             }
         catch (NumberFormatException e)
         {System.out.println("Serial field had value that was not an integer that should have been");}
        }
      }
    
    }
}
