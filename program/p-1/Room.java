

public class Room {
     
  private int roomno;
  private String roomType;
  private float roomArea;
  private boolean ACMachine;

  // Set  method 
  public void setroomno(int roomno) {
    this.roomno = roomno;
  }

  public void setRoomType(String roomType) {
    this.roomType = roomType;
  }

  public void setRoomArea(float roomArea) {
    this.roomArea = roomArea;
  }

  public void setACMachine(boolean ACMachine) {
    this.ACMachine = ACMachine;
  }

  // Get method
  public int getroomno() {
    return roomno;
  }

  public String getRoomType() {
    return roomType;
  }

  public float getRoomArea() {
    return roomArea;
  }

  public boolean isACMachine() {
    return ACMachine;
  }

  // Method to display room details
  public void displayData() {
    System.out.println("Room No: " + roomno);
    System.out.println("Room Type: " + roomType);
    System.out.println("Room Area: " + roomArea +"sqare fet");
    System.out.println("AC Machine: " + (ACMachine ? "Yes" : "No"));
  }

public static void main(String[] args) {
    Room room = new Room();

// Set the room details
room.setroomno(101);
room.setRoomType("kitchen room ");
room.setRoomArea(200);
room.setACMachine(false);

// Display the room details

room.displayData();
}

}
