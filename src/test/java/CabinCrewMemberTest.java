import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember member;

    @Before
    public void before(){
        member = new CabinCrewMember("Peppa Pig", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Peppa Pig", member.getName());
    }


    @Test
    public void hasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, member.getRank());
    }
}
