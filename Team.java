import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Players> players; //creates a dynamically sized list of NBA players of type Player (from the Player class)

//Team Constructor
public Team(String teamName) {
    this.teamName = teamName;
    this.players = new ArrayList<>(); //creates (initializes) new list (vector) to store players on the team for the current object.
    }

    public String getTeamName() {
        return teamName;
    }
    public List<Players> getPlayers() { //gets a list of Players on the team
        return players;
    }
    public void addPlayer(Players player) { //not sure why this is a void function
        players.add(player);    //adding a new player to the team. Still a bit confused by syntax.
        }
    }

