public class Club {
    private String name;
    private String stadium;
    private String coach;
    private String captain;

    // Getter
    public String getName() {
        return name;
    }
    public String getStadium() {
        return stadium;
    }
    public String getCoach() {
        return coach;
    }
    public String getCaptain() {
        return captain;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
    public void setCoach(String coach) {
        this.coach = coach;
    }
    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public void displayInfo() {
        System.out.println("Club info is as follow:");
        System.out.printf("Name: %s\nStadium: %s\nCoach: %s\nCaptain: %s\n\n", getName(), getStadium(), getCoach(), getCaptain());
    }
}
