import hotel.Booking;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(2, 22, RoomType.DOUBLE);
        booking = new Booking(bedroom, 4);
    }


    @Test
    public void hasBedroom() {
        assertEquals(this.bedroom, booking.getBedroom());
    }

    @Test
    public void hasNightsStaying(){
        assertEquals(4 , booking.getNights());
    }

    @Test
    public void hasATotalPrice(){
        assertEquals( 80, booking.getTotalPrice());
    }
}
