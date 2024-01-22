public class NBATeamStats {
    public static void main(String[] args) {
        NBADatabase nbaDatabase = new NBADatabase(); //Creates the database for all teams.

        //Create teams
        Team raptors = new Team("Toronto Raptors"); //East--Atlantic
        Team warriors = new Team("Golden State Warriors"); //West--Pacific
        //Add teams to database
        nbaDatabase.addTeam(raptors);
        nbaDatabase.addTeam(warriors);

        //Create players NOT DONE... Will take a long time.
        
        Players sBarnes = new Players("Scottie", "Barnes", "SG/SF/PF", 22, 'R', 20.1, 5.6, 8.4, 1.4, 1.4, 0.087); //raptors
        Players pSiakam = new Players("Pascal", "Siakam", "PF", 29, 'R', 22.2, 4.9, 6.3, 0.8, 0.3, 0.085);
        Players rBarrett = new Players("RJ", "Barrett", "SG/SF", 23, 'L', 18.8, 2.8, 5.0, 0.5, 0.3, 0.074);
        Players oAnunoby = new Players("OG", "Anunoby", "SF", 26, 'R', 15.1, 2.3, 4.2, 1.1, 0.6, 0.153);
        Players dSchroder = new Players("Dennis", "Schroder", "PG/SG", 30, 'R', 14.3, 6.5, 2.7, 0.8, 0.1, 0.081);
        Players sCurry= new Players("Stephen", "Curry", "PG", 35, 'R', 26.7, 4.9, 4.2, 0.9, 0.4, 0.046); //warriors
        Players kThompson= new Players("Klay", "Thompson", "SG", 34, 'R', 17.3, 2.4, 3.5, 0.5, 0.5, 0.030);
        Players dGreen = new Players("Draymond", "Green", "PF", 33, 'R', 9.5, 5.7, 5.6, 0.4, 0.7, 0.051);
  
        //Add players to teams
        raptors.addPlayer(sBarnes);
        raptors.addPlayer(pSiakam);
        raptors.addPlayer(rBarrett);
        raptors.addPlayer(oAnunoby);
        raptors.addPlayer(dSchroder);
        warriors.addPlayer(sCurry);
        warriors.addPlayer(kThompson);
        warriors.addPlayer(dGreen);

        displayAllPlayers(nbaDatabase);
    }
    private static void displayAllPlayers(NBADatabase nbaDatabase) {
        System.out.println("NBA Player Database:");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        for (Team team : nbaDatabase.getTeams()) { //I am confused by this logic
            System.out.println("Team: --" + team.getTeamName() + "--");
            for (Players player : team.getPlayers()) {
                System.out.println("\nPlayer: " + player.getFname() + " " + player.getLname() + "\n" + " Position: " + player.getPosition() + "   Age: " + player.getAge() + "   Handedness: " + player.getHand() + "\n" + "PPG: " + player.getPpg() + "   APG: " + player.getApg() + "   RPG: " + player.getRpg() + "   SPG: " + player.getSpg() + "   BPG: " + player.getBpg() + "   DWS: " + player.getDws());
            }
            System.out.println("----------------------------------------------------------------------------------------------------------");
        }      
                         
    }
}