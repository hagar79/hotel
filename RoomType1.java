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
public class RoomType1
{ 
      private String roomName ="Deluxe Room";
      private int roomID = 111;
      private String RoomDetails =" ";
     
    
    public RoomType1 (String roomName , int roomID)
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
        System.out.println(" 1 King Bed ");
        System.out.println(" 2 Twins Bed");
        System.out.println(" Pool view ");
        System.out.println(" Price Room 500 L.E");
        
        return RoomDetails;
    }

    public void setRoomDetails(String RoomDetails) 
    {
        this.RoomDetails = RoomDetails;
    }
    
    
    
}
