import java.util.ArrayList;

public class Flight {

    private PilotList pilotList;
    private CabinCrewMemberList cabinCrewList;
    private ArrayList<Passenger> passengerList;
    private Plane plane;
    private String number;
    private String destination;
    private String departure;
    private String deptTime;
    private int capacity;
    private int weight;

    public Flight(PilotList pilotList, CabinCrewMemberList cabinCrewList, Plane plane, String number, String destination, String departure, String deptTime){
        this.pilotList = pilotList;
        this.cabinCrewList = cabinCrewList;
        this.passengerList = new ArrayList<>();
        this.plane = plane;
        this.capacity= plane.getPlaneType().getCapacity();
        this.weight = plane.getPlaneType().getWeight();
        this.number=number;
        this.destination = destination;
        this.departure = departure;
        this.deptTime = deptTime;
    }

    public String getNumber() {
        return this.number;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDeparture() {
        return this.departure;
    }

    public String getTime() {
        return this.deptTime;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public void addPassenger(Passenger passenger){
        if (getAvailableSeats() > 0) {
        this.passengerList.add(passenger);
    }}

    public int getPassengerCount() {
        return this.passengerList.size();
    }

    public int getAvailableSeats() {
       int capacity = this.plane.getPlaneType().getCapacity();
       int passengers = this.passengerList.size();
       int remaining = capacity - passengers;
       return remaining;
    }

    public String pilotFly() {
        Pilot pilot = this.pilotList.getRoster().get(0);
        return pilot.flyPlane();
    }

    public String cabinMessage(String message) {
        CabinCrewMember crew1 = this.cabinCrewList.getRoster().get(0);
        return crew1.relayMessage(message);
    }

//    public String flyPlane(Rank rank) {
//    IF RANKS IS A PILOT's RANK
//    LOOP THROUGH THE PILOTLIST ARRAY LIST
//    IF rank matches argument
//        THEN SET NAME TO THIS ONE's NAME
//        return "Whoosh...Whoosh...This is " NAME + " flying";
//    }
}
