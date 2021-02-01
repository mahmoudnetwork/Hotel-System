/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author ASUS
 */
public class Ch9SimpleClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Socket s=new Socket("127.0.0.1",5000);
        InputStream is=s.getInputStream();
        
        BufferedReader bf=new BufferedReader(new InputStreamReader(is));
        String ServerMessage=bf.readLine();
        System.out.println("Server says :" + ServerMessage);
        bf.close();
        s.close();
    }
    
}
