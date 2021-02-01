/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author Mahmoud Awad
 */
public class TripleRoom extends Room{
   public TripleRoom(int NumberRoom, float Price, int Floor, int BedNo) {
        super(NumberRoom, Price, Floor, BedNo);
        this.setRoomtype("Triple");
    }
    
}
