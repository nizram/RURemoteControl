package projectorapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * CFDB Parser Reads and parses the contents of a section of the configuration file.
 * 
 * This code was adapted from The TrajGUI project for Rowan University in 2005.
 * The contributers of the the original project are: Chris Clement,
 * Peter Flanner, Dan Marzin, Josh Ogren, and Andrew Tasso.
 * 
 * @author marzin
 * @version 0.1
 */
public class CFDBParser
{
    //Hashmap containing DBInfo objects 
    private HashMap <String, DBInfo> dbMap;
    //ArrayList containing the list of databases
    private ArrayList<String> dbList;
    
    /**
     * Creates a CFDBParser with the specified CFSeparator
     * 
     * @param separator The Config File Separator to be used to separate the
     * config file
     */    
    public CFDBParser(CFSeparator separator)
    {
        //initialize the hashmap
        dbMap = new HashMap<String, DBInfo>();
        //initialize the list of database names
        dbList = new ArrayList<String>();
        //parse the database section of the config file
        parseFile(separator.getDBSection());
    }   

    /**
     * Parses the desired contents of the DB section of the config file
     * 
     * @param fileData A String containing the contents of the DB section
     * of a config file
     */
    private void parseFile(String fileData)
    {
        //initialize the data members
        DBInfo tempInfo = new DBInfo();
        String temp = new String();
        String tempName = new String();
        //create a string tokenizer using the DB section string
        StringTokenizer st = new StringTokenizer(fileData);
        
        //loop while there are more tokens to iterate through
        while(st.hasMoreTokens())
        {
            //assign the next token to temp
            temp = st.nextToken();  
            //if the first char is not a #
            if(temp.charAt(0) == '#')
            {   
                //if !null && valid
                if(tempName != null && tempInfo.isValid())
                {
                    //add the DBInfo object to the map with the key
                    //tempName
                    dbMap.put(tempName, tempInfo);
                    //add tempName to the list of db names
                    dbList.add(tempName);
                
                }
                
                //assign the next token to tempName
                tempName = st.nextToken();
                tempInfo = new DBInfo();
            
            }
            //set the value of JDBCregular
            else if(temp.equals("jdbcRegular=")&& tempInfo != null)
            {
                tempInfo.setJdbcRegular(st.nextToken());
            }
            //set the value of the DB host
            else if(temp.equals("jdbcHost=")&& tempInfo != null)
            {
                tempInfo.setJdbcHost(st.nextToken());
            }
            //set the value of the host address
            else if(temp.equals("jdbcHostAddress=")&& tempInfo != null)
            {
                tempInfo.setJdbcHostAddress(st.nextToken());
            }
            //set the value of the driver to be used to connect to the
            //database
            else if(temp.equals("jdbcDriver=")&& tempInfo != null)
            {
                tempInfo.setJdbcDriver(st.nextToken());
            }
            //set the value of the port to be used to connect to the database
            else if(temp.equals("jdbcPort=")&& tempInfo != null)
            {
                tempInfo.setJdbcPort(st.nextToken());
            }
            //set the value of the the database name
            else if(temp.equals("jdbcSid=")&& tempInfo != null)
            {
                tempInfo.setJdbcSid(st.nextToken());
            }
            //set the value of the username
            else if(temp.equals("jdbcUser=")&& tempInfo != null)
            {
                tempInfo.setJdbcUser(st.nextToken());
            }
            //set the value of the users password
            else if(temp.equals("jdbcPassword=")&& tempInfo != null)
            {
                tempInfo.setJdbcPassword(st.nextToken());
            }
            
        }
        //if !null && valid
        if(tempName != null && tempInfo.isValid())
        {
            //add the temporary DBInfo object using tempName
            //as the key
            dbMap.put(tempName, tempInfo);
            //add tempName to the list of DB names
            dbList.add(tempName);
        }
                    
    }
    
    /**
     * Returns a DBInfo object based on the name of the database
     * 
     * @param name The name of the database
     * @return a DBinfo object with the specified name
     */
    public DBInfo getInfo(String name)
    {
        return dbMap.get(name); 
    }

    /**
     * Returns the list of database names
     * 
     * @return a String array of the database names
     */    
    public String[] getList()
    {
        return dbList.toArray(new String[dbList.size()]);
        //apparently java toArray wasn't working to well with templatedArrayList
        //I won by using the other form of it and just handfeeding
        //it the type
    }

}