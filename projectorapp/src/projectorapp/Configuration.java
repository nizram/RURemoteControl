package projectorapp;

import java.net.Inet4Address;
import java.net.InetAddress;

/**
 * Configuration
 * 
 * @author marzin
 * @version 0.1
 */
public class Configuration
{
    private String title;
    private String type;
    private String make;
    private String model;
    private InetAddress ipAddress;
    private int speed;
    private int dataBits;
    private String parity;
    private int stopBits;
    private boolean tecRoom;
    
    public Configuration()
    {
        title = "";
        type = "";
        make = "";
        model = "";
        speed = 0;
        dataBits = 0;
        parity = "";
        stopBits = 0;
        tecRoom = false;
        
        try
        {
            ipAddress = InetAddress.getByName("0.0.0.0");
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
    
    public Configuration(String n, String t, String ma, String mo, int s, 
            int db, String p, int sb, boolean te, InetAddress ip)
    {
        title = n;
        type = t;
        make = ma;
        model = mo;
        speed = s;
        dataBits = db;
        parity = p;
        stopBits = sb;
        tecRoom = te;
        ipAddress = ip;
    }
    
    public String getConfigString()
    {
        StringBuilder x = new StringBuilder();
        x.append("NAME="+title+"\n");
        x.append("TYPE="+type+"\n");
        x.append("MAKE="+make+"\n");
        x.append("MODEL="+model+"\n");
        x.append("IPADDRESS="+ipAddress+"\n");
        x.append("SERIAL="+speed+" "+dataBits+parity+stopBits+"\n\n");
        
        return x.toString();
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getType()
    {
        return type;
    }
    
    public String getMake()
    {
        return make;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public int getDataBits()
    {
        return dataBits;
    }
    
    public String getParity()
    {
        return parity;
    }
    
    public int getStopBits()
    {
        return stopBits;
    }
    
    public boolean getTecRoom()
    {
        return tecRoom;
    }
    
    public InetAddress getIpAddress()
    {
        return ipAddress;
    }
    
    public void setTitle(String n)
    {
        this.title = n;
    }
    
    public void setType(String t)
    {
        this.type = t;
    }
    
    public void setMake(String m)
    {
        this.make = m;
    }
    
    public void setModel(String m)
    {
        this.model = m;
    }
    
    public void setSpeed(int s)
    {
        this.speed = s;
    }
    
    public void setDataBits(int d)
    {
        this.dataBits = d;
    }
    
    public void setParity(String p)
    {
        this.parity = p;
    }
    
    public void setStopBits(int b)
    {
        this.stopBits = b;
    }
    
    public void setTecRoom(boolean t)
    {
        this.tecRoom = t;
    }
    
    public void getIpAddress(InetAddress i)
    {
        this.ipAddress = i;
    }
}
