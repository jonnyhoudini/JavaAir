import java.util.ArrayList;

public class CabinCrewMemberList {

    private ArrayList<CabinCrewMember> roster;

    public CabinCrewMemberList(ArrayList<CabinCrewMember> roster){
        this.roster = roster;
    }

    public int getCount() {
        return roster.size();
    }

    public ArrayList<CabinCrewMember> getRoster(){
        ArrayList<CabinCrewMember> copyOfRoster = new ArrayList<>(this.roster);
        return copyOfRoster;
    }
}
