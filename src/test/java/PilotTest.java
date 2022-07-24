import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Noel Renaud", Rank.CAPTAIN, "AZ473");
    }

    @Test
    public void hasName(){
        assertEquals("Noel Renaud", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicence(){
        assertEquals("AZ473", pilot.getLicence());
    }
}
