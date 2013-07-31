/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package np1000test;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 *
 * @author marzin
 */
public class NP1000Network
{
    private static int port = 7142;
    
    public static Socket openConnection(InetAddress addr)
    {
        //SocketAddress sockaddr = new InetSocketAddress("150.250.102.128", 7142);
        //Socket s = new Socket();
        Socket s = null;
        try
        {
            System.out.println("Opening Connection");
            s = new Socket("150.250.102.128", port);
            //s.connect(sockaddr, 10000);
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
        return s;
    }
    
    public static void closeConnection(Socket s)
    {
        try
        {
            s.close();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
}
