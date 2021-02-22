/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelresevation;

/**
 *
 * @author Hope
 */
public class RoomType6
{
     private String roomName ="Deluxe Triple Room";
    private int roomID = 666;
    private String RoomDetails =" ";
      
    public RoomType6 (String roomName , int roomID)
    {
        this.roomID=roomID;
        this.roomName=roomName;
    }

    public String getRoomName()
    {
        return roomName;
    }

    public void setRoomName(String roomName)
    {
        this.roomName = roomName;
    }

    public int getRoomID() 
    {
        return roomID;
    }

    public void setRoomID(int roomID) 
    {
        this.roomID = roomID;
    }

    public String getRoomDetails() 
    {
        System.out.println(" 1 twin bed  and 1 king bed ");
        System.out.println(" Garden view Pool view ");
        System.out.println(" Price Room 200 L.E");
        return RoomDetails;
    }

    public void setRoomDetails(String RoomDetails) 
    {
        this.RoomDetails = RoomDetails;
    }
    
}
