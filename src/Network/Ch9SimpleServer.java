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
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ASUS
 */
public class Ch9SimpleServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket ss=new ServerSocket(5000);
        Socket ClientSocket=new Socket();
        ClientSocket=ss.accept();
        System.out.println("Client Connected " + ClientSocket.toString()); 
        OutputStream os=ClientSocket.getOutputStream();
        InputStream is=ClientSocket.getInputStream();
        PrintWriter pw=new PrintWriter(os,true);
        pw.write("Hello from the server");
        pw.close();
        ClientSocket.close();
        ss.close();
        
        
        /*BufferedReader bf=new BufferedReader(new InputStreamReader(is));
        String ClientMessage=bf.readLine();
        System.out.println("Client says" + ClientMessage);
        
        bf.close();
        ClientSocket.close();
        ss.close();
        */
        
    }
    
}
