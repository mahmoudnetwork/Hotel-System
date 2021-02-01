
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author User
 */
public class Room {
     private int NumberRoom;
     private    float Price ;
     private    int Floor ;
     private    int BedNo;
     private  boolean IsUsed ;
     private String RoomType; // this attribut get value Single , double or triple
     Guest guest;
                                            /**************************************
                                            this constructor to set main of Room Data 

                                            that used by Manager to add anther room  
                                            ****************************************/
     public Room(int NumberRoom,float Price,int Floor,int BedNo)
     {
         this.NumberRoom=NumberRoom;
         this.Price=Price;
         this.Floor=Floor;
         this.BedNo=BedNo;
         this.IsUsed = false ;
         this.guest = null ;
     }
     /*
     this constructor to Book this room to special guest
     that is used by Receptionis Booked this Room
     */
     
     public void RoomBook(Guest guest)
     {
         this.guest = guest ;
         this.IsUsed = true ;
     }
     //setter
     public void setNumberRoom(int NumberRoom)
     {
         this.NumberRoom=NumberRoom;
     }
     //getter
     public int getNumberRoom()
     {
         return NumberRoom;
     }
     //setter
     public void setPrice(float Price)
     {
         this.Price=Price;
     }
     //getter
     public float getPrice()
     {
         return Price;
     }
     //setter
     public void setFloor(int Floor)
     {
         this.Floor=Floor;
     }
     //getter
     public int getFloor()
     {
         return Floor;
     }
     //setter
     public void setBedNo(int BedNo)
     {
         this.BedNo=BedNo;
     }
     //getter
     public int getBedNo()
     {
         return BedNo;
     }
     //setter
     public void setGuste(Guest guest)
     {
         this.guest = guest ;
     }
     //getter
     public Guest getGuest()
     {
         return this.guest;
     }
     //setter
     public void setRoomtype(String RoomType)
     {
         this.RoomType = RoomType;
     }
     //getter
     public String getRoomType()
     {
         return this.RoomType;
     }
}
