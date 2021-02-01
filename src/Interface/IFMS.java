/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.io.*;
import java.util.ArrayList;
public interface IFMS {
    public void Write(String data,String FilePath,boolean Type)throws IOException;
     public ArrayList<Object> Read(String FilePath)throws FileNotFoundException;
}
