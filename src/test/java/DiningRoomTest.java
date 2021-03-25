import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;
import rooms.DiningRoom;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom(50, "The Batman Room");
    }

    @Test
    public void hasCapacity() {
        assertEquals(50, diningRoom.getCapacity());
    }

    @Test
    public void hasRoomName() {
        assertEquals("The Batman Room", diningRoom.getName());
    }

    @Test
    public void hasACapacityOfGuests(){
        diningRoom.addGuest(guest);
        diningRoom.addGuest(guest);
        diningRoom.addGuest(guest);
        assertEquals(3, diningRoom.getNumberOfGuest());

    }
}
