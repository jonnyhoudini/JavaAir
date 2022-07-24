import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberListTest {

    CabinCrewMemberList cabinCrewMemberList;
    CabinCrewMember cabinCrew1;
    CabinCrewMember cabinCrew2;

    @Before
    public void before(){
        cabinCrew1 = new CabinCrewMember("Simone de Beauvoir", Rank.FLIGHT_ATTENDANT);
        cabinCrew2 = new CabinCrewMember("Astérix de Gaulle", Rank.PURSER);
        ArrayList<CabinCrewMember> roster = new ArrayList<>();
        roster.add(cabinCrew1);
        roster.add(cabinCrew2);
        cabinCrewMemberList = new CabinCrewMemberList(roster);
    }

    @Test
    public void canGetCrewCount(){
        assertEquals(2, cabinCrewMemberList.getCount());
    }
}
