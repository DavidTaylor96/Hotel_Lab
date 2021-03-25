package rooms;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;
//    private boolean occupied;

    public Bedroom(int capacity, int roomNumber, RoomType roomType) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
//        this.occupied = false;
    }


    public int getRoomNumber(){
        return this.roomNumber;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public int getNightlyRate(){
        return roomType.getNightlyRate();
    }

//    public boolean getEmptyRoom(){
//        this.occupied = false;
//    }
}
