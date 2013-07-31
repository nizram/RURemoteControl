/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package np1000test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author marzin
 * @version 0.1
 */
public class NP1000Test
{
    private int port = 7142;
    private static Socket s = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Creating Socket");
        s = NP1000Network.openConnection(getIP());
        NP1000Commands.poweron(s);
        System.out.println("Closing Connection");
        NP1000Network.closeConnection(s);
    }
    
    public static InetAddress getIP()
    {
        InetAddress ip = null;
        String input = "150.250.102.128";        
        try
        {
            System.out.println("IPADDRESS: " + input);
            ip = InetAddress.getByName(input);
            System.out.println("INETADDRESS: " + ip.getHostAddress());
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
        return ip;
    }
}
