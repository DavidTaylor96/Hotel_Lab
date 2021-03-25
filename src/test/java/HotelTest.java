import guest.Guest;
import hotel.Booking;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.RoomType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    Guest guest;
    ConferenceRoom conferenceRoom;
    ArrayList<Bedroom> bedroomList;
    ArrayList<ConferenceRoom> conferenceRoomList;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(2, 22, RoomType.SINGLE);
        conferenceRoom = new ConferenceRoom(24, "The Black Room");
        guest = new Guest("Wee Jimmy");

        bedroomList = new ArrayList<Bedroom>();

        conferenceRoomList = new ArrayList<ConferenceRoom>();

    }

    @Test
    public void hasBedrooms() {
        assertEquals(0, hotel.getBedrooms());
    }

    @Test
    public void hasConferenceRoom() {
        assertEquals(0, hotel.getConferenceRoom());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals( 1, hotel.getBedrooms());
    }

    @Test
    public void canAddedConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRoom());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkIn(guest, bedroom);
        assertEquals(1, bedroom.getNumberOfGuest());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkIn(guest, bedroom);
        hotel.checkOut(guest, bedroom);
        assertEquals(0, bedroom.getNumberOfGuest());
    }

    @Test
    public void canBookRoom() {
        Booking expected = new Booking(bedroom, 4);
        Booking hotelBooking = hotel.bookRoom(bedroom, 4);
        assertEquals(expected.getBedroom(), hotelBooking.getBedroom());
        assertEquals(expected.getNights(), hotelBooking.getNights());

    }

    @Ignore
    @Test
    public void canGetEmptyRoom(){
        Bedroom bedroom1 = new Bedroom(2,35, RoomType.DOUBLE);
        Bedroom bedroom2 = new Bedroom(1, 31, RoomType.SINGLE);
        Bedroom bedroom3 = new Bedroom(3, 30, RoomType.TRIPLE);
        bedroom1.addGuest(guest);

        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);

        Hotel newHotel = new Hotel();

        assertEquals( 2, newHotel.emptyBedrooms().size());

    }
}
