public class main {

    public static void main (String [] args) {
        Club chelsea = new Club();
        Club manCity = new Club();
        Club arsenal = new Club();
        Club spurs = new Club();

        chelsea.setName("Chelsea");
        chelsea.setStadium("Standford Bridge");
        chelsea.setCoach("Graham Potter");
        chelsea.setCaptain("Thiago Silva");

        manCity.setName("Manchester City");
        manCity.setStadium("Etihad Stadium");
        manCity.setCoach("Pep Guadiola");
        manCity.setCaptain("Kelvin Debryune");

        arsenal.setName("Arsenal");
        arsenal.setCaptain("Martin Odegaard");
        arsenal.setCoach("Mikel Arteta");
        arsenal.setStadium("Emirates Stadium");

        spurs.setCoach("Antonio Conte");
        spurs.setCaptain("Hugo Lloris");
        spurs.setName("Tottenham Hotspurs");
        spurs.setStadium("Tottenham Stadium");

        chelsea.displayInfo();
        manCity.displayInfo();
        arsenal.displayInfo();
        spurs.displayInfo();
    }
}
