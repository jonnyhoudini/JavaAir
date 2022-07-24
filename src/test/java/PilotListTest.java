import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PilotListTest {

    PilotList pilotList;

    Pilot pilot1;

    Pilot pilot2;

    @Before
    public void before(){
        pilot1 = new Pilot("Noel Renaud", Rank.CAPTAIN, "AZ283");
        pilot2 = new Pilot("Marguerite Delacoeur", Rank.FIRST_OFFICER, "PP788");
        ArrayList<Pilot> newRoster = new ArrayList<>();
        newRoster.add(pilot1);
        newRoster.add(pilot2);
        pilotList = new PilotList(newRoster);
    }

    @Test
    public void getPilotCount(){
        assertEquals(2, pilotList.getPilotCount());
    }
}
