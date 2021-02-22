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
public class RoomType3
{
     private String roomName ="Family Suite (2 Adults)";
    private int roomID = 333;
    private String RoomDetails =" ";
    
    public RoomType3 (String roomName , int roomID)
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
        System.out.println(" 2 twin beds  and 1 king bed ");
        System.out.println(" Garden View ");
        System.out.println(" Price Room 200 L.E");
        return RoomDetails;
    }

    public void setRoomDetails(String RoomDetails) 
    {
        this.RoomDetails = RoomDetails;
    }
    
}
