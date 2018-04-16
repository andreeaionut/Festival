import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Concert_FXML {
    private UUID concertID;
    private UUID artistID;
    private String artistName;
    private LocalDate date;
    private LocalTime time;
    private int numberOfAvailableTickets;
    private int numberOfSoldTickets;
    private String location;

    public Concert_FXML(UUID concertID, UUID artistID, String artistName, LocalDate date, LocalTime time, int numberOfAvailableTickets, int numberOfSoldTickets, String location) {
        this.concertID = concertID;
        this.artistID = artistID;
        this.artistName = artistName;
        this.date = date;
        this.time = time;
        this.numberOfAvailableTickets = numberOfAvailableTickets;
        this.numberOfSoldTickets = numberOfSoldTickets;
        this.location = location;
    }

    public UUID getConcertID() {
        return concertID;
    }

    public void setConcertID(UUID concertID) {
        this.concertID = concertID;
    }

    public UUID getArtistID() {
        return artistID;
    }

    public void setArtistID(UUID artistID) {
        this.artistID = artistID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getNumberOfAvailableTickets() {
        return numberOfAvailableTickets;
    }

    public void setNumberOfAvailableTickets(int numberOfAvailableTickets) {
        this.numberOfAvailableTickets = numberOfAvailableTickets;
    }

    public int getNumberOfSoldTickets() {
        return numberOfSoldTickets;
    }

    public void setNumberOfSoldTickets(int numberOfSoldTickets) {
        this.numberOfSoldTickets = numberOfSoldTickets;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
