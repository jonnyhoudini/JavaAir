public class Pilot extends Crew {
    private String name;
    private Rank rank;
    private String licence;


    public Pilot(String name, Rank rank, String licence) {
        super(name, rank);
        this.licence = licence;
    }

    public String getLicence() {
        return licence;
    }

    public String flyPlane() {
        return "Whoosh... Whoosh...";
    }
}
