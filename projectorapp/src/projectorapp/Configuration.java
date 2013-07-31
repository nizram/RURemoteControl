package projectorapp;

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
    private String pc;
    private String laptop;
    private String dvd;
    private String vcr;
    private String doccam;
    
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
        pc = "";
        laptop = "";
        dvd = "";
        vcr = "";
        doccam = "";
        
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
            int db, String p, int sb, boolean te, InetAddress ip, String c,
            String l, String d, String v, String dc)
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
        pc = c;
        laptop = l;
        dvd = d;
        vcr = v;
        doccam = dc;
    }
    
    public String getConfigString()
    {
        StringBuilder x = new StringBuilder();
        x.append("NAME=").append(title).append("\n");
        x.append("TYPE=").append(type).append("\n");
        x.append("MAKE=").append(make).append("\n");
        x.append("MODEL=").append(model).append("\n");
        x.append("IPADDRESS=").append(ipAddress).append("\n");
        x.append("SERIAL=").append(speed).append(" ").append(dataBits).append(parity).append(stopBits).append("\n\n");
        
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
    
    public String getPC()
    {
        return pc;
    }
    
    public String getLaptop()
    {
        return laptop;
    }
    
    public String getDVD()
    {
        return dvd;
    }
    
    public String getVCR()
    {
        return vcr;
    }
    
    public String getDoccam()
    {        
        return doccam;
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
    
    public void setPC(String p)
    {
        this.pc = p;
    }
    
    public void setLaptop(String l)
    {
        this.laptop = l;
    }
    
    public void setDVD(String d)
    {
        this.dvd = d;
    }
    
    public void setVCR(String v)
    {
        this.vcr = v;
    }
    
    public void setDoccam(String d)
    {        
        this.doccam = d;
    }
}
