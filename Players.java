public class Players {
    private String fname; 
    private String lname;
    private String position;
    private int age;
    private char hand; //dominant hand
    private double ppg; //points per game
    private double apg; //assists per game 
    private double rpg; //rebounds per game
    private double spg; //steals per game
    private double bpg; //blocks per game 
    private double dws; //defensive win shares
    
    //player constructor
    public Players(String fname, String lname, String position, int age, char hand, double ppg, double apg, double rpg, double spg, double bpg, double dws) {
        this.fname = fname;
        this.lname = lname;
        this.position = position;
        this.age = age;
        this.hand = hand;
        this.ppg = ppg;
        this.apg = apg;
        this.rpg = rpg;
        this.spg = spg; 
        this.bpg = bpg;
        this.dws = dws;  
    }

    //Getters
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public String getPosition() {
        return position;
    }
    public int getAge() {
        return age;
    } 
    public char getHand() {
        return hand;
    }
    public double getPpg() {
        return ppg;
    }
    public double getApg() {
        return apg;
    }
    public double getRpg() {
        return rpg;
    }
    public double getSpg() {
        return spg;
    }
    public double getBpg() {
        return bpg;
    }
    public double getDws() {
        return dws;
    }


    //Setters
    public void setFname(String playerFname) {
        fname = playerFname;
    }
    public void setLname(String playerLname) {
        lname = playerLname;
    }
    public void setPosition(String playerPosition) {
        position = playerPosition;
    }
    public void setAge(int playerAge) {
        age = playerAge;
    }
    public void setHand(char playerHand) {
        hand = playerHand;
    }
    public void setPpg(double playerPpg) {
        ppg = playerPpg;
    }
    public void setApg(double playerApg) {
        apg = playerApg;
    }
    public void setRpg(double playerRpg) {
        rpg = playerRpg;
    }
    public void setSpg(double playerSpg) {
        spg = playerSpg;
    }
    public void setBpg(double playerBpg) {
        bpg = playerBpg;
    }
    public void setDws(double playerDws) {
        dws = playerDws;
    }


}


