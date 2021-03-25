import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest{

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {

        conferenceRoom = new ConferenceRoom(50, "Codeclan Room");
        guest = new Guest("John");
    }

    @Test
    public void hasCapacity() {
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void hasRoomName() {
        assertEquals("Codeclan Room", conferenceRoom.getName());
    }


}
