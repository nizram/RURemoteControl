package projectorapp;

/**
 * ProjectorTypes 
 * 
 * @author marzin
 * @version 0.1
 */
public class ProjectorTypes
{
    public static String[] getMakes()
    {
        return new String[] {"NEC", "Epson", "Sharp"};
    }
    
    public static String[] getModels(String make)
    {
        String[] models = {};
        
        if (make.equals("NEC"))
        {
            models = new String[] {"MT1065", "MT1000", "NP900"};
        }
        else if (make.equals("Epson"))
        {
            models = new String[] {"EP100", "Ep200"};
        }
        else if (make.equals("Sharp"))
        {
            models =  new String[] {"SP100"};
        }
        
        return models;
    }
}
