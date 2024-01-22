import java.util.ArrayList;
import java.util.List;

public class NBADatabase {
    private List<Team> teams;

    //Database constructor
    public NBADatabase() {
        this.teams = new ArrayList<>(); //Creates a new object. Sets up an empty list called 'teams' to store basketball teams in the database.
    }
    public void addTeam(Team team) {
        teams.add(team);
    }
    //Getters for teams
    public List<Team> getTeams() { //Function that returns a List of all NBA teams I have created objects for. 
        return teams;
    }
}