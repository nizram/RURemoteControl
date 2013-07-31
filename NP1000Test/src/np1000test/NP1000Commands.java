/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package np1000test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author marzin
 * @version 0.1
 */
public class NP1000Commands
{
    //byte[] RUNNING_SENSE = new byte[] {(byte)0x00, (byte)0x81, (byte)0x00, (byte)0x00, (byte)0x81};
    //byte[] COMMON_DATA_REQUEST;
    //byte[] ERROR_STATUS_REQUEST;
    public static void poweron(Socket s)
    {
        int length = 0;
        OutputStream socketOutputStream = null;
        //DataInputStream dIn = null;
        DataOutputStream dOut = null;
        byte[] POWER_ON = new byte[] {(byte)0x02, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x02};
        try
        {
            System.out.println("Attempting to power on the projector");
            dOut = new DataOutputStream(s.getOutputStream());
            System.out.println("Byte Array Length: " + POWER_ON.length);
            dOut.writeInt(POWER_ON.length);
            System.out.println("Byte Array Contents: " + POWER_ON);
            dOut.write(POWER_ON);
            /*dIn = new DataInputStream(s.getInputStream());
            length = dIn.readInt();                    // read length of incoming message
            if(length>0)
            {
                byte[] message = new byte[length];
                dIn.readFully(message, 0, message.length); // read the message
            }*/
            //socketOutputStream = s.getOutputStream();
            //socketOutputStream.write(POWER_ON);
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
    
    public static void poweroff(Socket s)
    {
        byte[] POWER_OFF = new byte[] {(byte)0x02, (byte)0x01, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x03};
    }
}
