package projectorapp;

/**
 * CFCommunications Reads and stores the contents of the configuration file.
 * 
 * This code was adapted from The TrajGUI project for Rowan University in 2005.
 * The contributers of the the original project are: Chris Clement,
 * Peter Flanner, Dan Marzin, Josh Ogren, and Andrew Tasso.
 * 
 * @author marzin
 * @version 0.1
 */
public class CFCommunications
{
    //Config file separator
    private CFSeparator separator;
    //Metrics Parser
    private CFMetricParser metricParser;
    //Database Parser
    private CFDBParser dbParser;
    //Color Parser
    private CFColorParser colorParser;  
    //Plottable Parser
    private CFPlottableParser plottableParser;

    /**
     * Creates a new CFCommunications object with the specified 
     * configuration file name
     * 
     * @param configFileName A String containing the name of the config file
     */
    public CFCommunications(String configFileName)
    {
        //initialize the separator with the TrajGUI config file
        separator = new CFSeparator(configFileName);
        //intialize the metrics parser with the separator
        metricParser = new CFMetricParser(separator);
        //intialize the DB parser with the separator
        dbParser = new CFDBParser(separator);
        //intialize the colors parser with the separator        
        colorParser = new CFColorParser(separator);
        //intialize the plottable parser with the separator
        plottableParser = new CFPlottableParser(separator);
    
    }

    /**
     * Returns the database list
     * 
     * @return A String array contain the list of databases
     */
    public String[] getDBList()
    {
        return dbParser.getList();
    }

    /**
     * Returns a DBInfo object with the specified database name
     * 
     * @param DBname The name of the Database to obtain the DBInfo object for
     * @return A DBInfo object pertaining the the specified name
     */    
    public DBInfo getConnectionInfo(String DBname)
    {
        return dbParser.getInfo(DBname);
    }
    
    /**
     * Returns an array of the default plot colors
     * 
     * @return An array of Color objects which are the default plot colors
     */      
    public Color[] getDefPlotColorList()
    {
        return colorParser.getColorArray();
    } 
    
    /**
     * Returns the default metrics list
     * 
     * @return A string array of the names of the default metrics field names
     */      
    public String[] getDefMetricsList()
    {
        return metricParser.getMetricsArray();
    }

    /**
     * Returns the list of plottable fields
     * 
     * @return A String array of the names of the plottable fields
     */  
    public String[] getPlottableFieldsList()
    {
        return plottableParser.getPlottableArray(); 
    }
}