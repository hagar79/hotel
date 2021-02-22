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
public class RoomType4 
{
     private String roomName ="Junior Family Suite (2 Adults)";
    private int roomID = 444;
    private String RoomDetails =" ";
    
    public RoomType4 (String roomName , int roomID)
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
        System.out.println("1 king bed  and 2 sofa beds ");
        System.out.println(" Pool And Garden Veiw");
        System.out.println(" Price Room 250 L.E");
        return RoomDetails;
    }

    public void setRoomDetails(String RoomDetails) 
    {
        this.RoomDetails = RoomDetails;
    }
    
}
