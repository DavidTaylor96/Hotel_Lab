package hotel;

import guest.Guest;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int getBedrooms(){
        return this.bedrooms.size();
    }


    public int getConferenceRoom(){
        return this.conferenceRooms.size();
    }


    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkIn(Guest guest, Room room){
        room.addGuest(guest);
    }

    public void checkOut(Guest guest, Room room){
        room.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int nights){
        return new Booking(bedroom, nights);
    }


    public ArrayList<Bedroom> emptyBedrooms() {
        ArrayList<Bedroom> result = new ArrayList<Bedroom>();
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getNumberOfGuest() == 0) {
                result.add(bedroom);
            }
        }
        return result;
    }

}
