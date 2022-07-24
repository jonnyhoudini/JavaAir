public class CabinCrewMember extends Crew {
  private String name;
  private Rank rank;

    public CabinCrewMember(String name, Rank rank) {
       super(name, rank);
    }

    public String relayMessage(String message) {
      return message;
    }
}
