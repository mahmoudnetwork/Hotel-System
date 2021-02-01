
package core;


public class Bill {
    public int BillNo;
    //public int GuestID;
    Guest x;
    public Bill(int BillNo,int GuestID,Guest myguest)
    {
        this.BillNo=BillNo;
        //this.GuestID=GuestID;
        x=myguest;
    }
    //setter
    public void setBillNo(int BillNo)
    {
        this.BillNo=BillNo;
    }
    //getter
    public int getBillNo()
    {
        return BillNo;
    }
    //setter
   /* public void setGuestID(int GuestID)
    {
        this.GuestID=GuestID;
    }
    //getter
    public int getGuestID()
    {
        return GuestID;
    }*/
}
