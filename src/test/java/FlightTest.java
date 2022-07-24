import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {
    Flight flight;
    PilotList pilotList;
    Pilot pilot;
    ArrayList<Pilot> pilotRoster;
    ArrayList<CabinCrewMember> crewRoster;
    CabinCrewMemberList cabinCrewMemberList;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;

    Passenger passenger1;

    Plane plane;

    @Before
    public void before(){
        pilot = new Pilot("Jacques Dupont", Rank.CAPTAIN, "YU362");
        pilotRoster = new ArrayList<>();
        pilotRoster.add(pilot);
        pilotList = new PilotList(pilotRoster);

        cabinCrewMember1 = new CabinCrewMember("Geraldine Bécassine", Rank.PURSER);
        cabinCrewMember2 = new CabinCrewMember("Stephane Fernandez", Rank.FLIGHT_ATTENDANT);
        crewRoster = new ArrayList<>();
        crewRoster.add(cabinCrewMember1);
        crewRoster.add(cabinCrewMember2);
        cabinCrewMemberList = new CabinCrewMemberList(crewRoster);

        plane = new Plane(PlaneType.Cessna_172);

        passenger1 = new Passenger("Jonny Mac", 1);

        flight = new Flight(pilotList, cabinCrewMemberList, plane, "EZY7362", "ATH", "GLA", "14.50");
    }

    @Test
    public void hasAtLeastOnePilot(){
        assertTrue("Fewer than one pilot", pilotList.getPilotCount() >= 1);
    }

    @Test
    public void hasAtLeastTwoCrew(){
        assertTrue("Fewer than two crew", cabinCrewMemberList.getCount() >= 2);
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("EZY7362", flight.getNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("ATH", flight.getDestination());
    }

    @Test
    public void hasDeparture(){
        assertEquals("GLA", flight.getDeparture());
    }

    @Test
    public void hasTime(){
        assertEquals("14.50", flight.getTime());
    }

    @Test
    public void hasPlane(){
        assertEquals(PlaneType.Cessna_172, flight.getPlane().getPlaneType());
    }

    @Test
    public void pilotCanFly(){
        assertEquals("Whoosh... Whoosh...", flight.pilotFly());
    }

    @Test
    public void cabinCanRelayMessage(){
        assertEquals("Brace Brace!", flight.cabinMessage("Brace Brace!"));
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void canGetAvailableSeats(){
        flight.addPassenger(passenger1);
        assertEquals(4, flight.getAvailableSeats());
    }

    @Test
    public void cannotAddPassenger(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        assertEquals(0, flight.getAvailableSeats());
    }


}
