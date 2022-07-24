import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Jonny", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Jonny", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }
}
