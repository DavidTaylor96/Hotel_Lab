import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 10, RoomType.DOUBLE);
        guest = new Guest("Mark");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(10, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasRoomType(){
        assertEquals( RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void guestHasName(){
        assertEquals(0, bedroom.getNumberOfGuest());
    }

    @Test
    public void hasNightlyRate() {
        assertEquals(20, bedroom.getNightlyRate());
    }
}
