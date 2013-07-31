package projectorapp;

/**
 * ProjectorTypes 
 * 
 * @author marzin
 * @version 0.1
 */
public class ProjectorTypes
{
    public static String[] getMakes(String type)
    {
        //String makes[];
        if ("Projector".equals(type))
        {
            return new String[] {"NEC", "Epson", "Sharp"};
        }
        else if ("Television".equals(type))
        {
            return new String[] {"Sharp", "NEC", "Samsung"};
        }
        else
        {
            return new String[] {};
        }
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
