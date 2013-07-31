package projectorapp;

import jssc.SerialPortList;

/**
 * Serial
 * 
 * @author marzin
 * @version 0.1
 */
public class Serial
{
    public static String[] getSpeeds()
    {
        return new String[] {"75", "110", "300", "1200", "2400", "4800", "9600", "19200", "38400", "57600", "115200"};
    }
    
    public static String[] getDataBits()
    {
        return new String[] {"5", "6", "7", "8", "9"};
    }
    
    public static String[] getParity()
    {
        return new String[] {"NONE", "ODD", "EVEN", "MARK", "SPACE"};
    }
    
    public static String[] getStopBits()
    {
        return new String[] {"1", "2"};
    }
    
    public static void getPorts()
    {
        System.out.println(SerialPortList.getPortNames());
    }
}
