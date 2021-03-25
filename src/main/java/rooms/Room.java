package rooms;

import guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity(){
        return capacity;
    }

    public int getNumberOfGuest(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest){
        guests.remove(guest);
    }
}
