import guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuestTest {

    private Guest guest;

    @Before
    public void setUp(){
        guest = new Guest("David");
    }

    @Test
    public void hasName(){
        assertEquals("David", guest.getName());
    }

}