import java.util.ArrayList;

public class PilotList {
    private ArrayList<Pilot> roster;

    public PilotList(ArrayList<Pilot> roster){
        this.roster = roster;
    }

    public int getPilotCount() {
        return this.roster.size();
    }

    public ArrayList<Pilot> getRoster() {
        ArrayList<Pilot> copyOfRoster = new ArrayList<>(this.roster);
        return copyOfRoster;
    }
}
