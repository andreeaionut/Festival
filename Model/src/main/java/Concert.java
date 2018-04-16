import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class Concert implements HasID<UUID>{
    private UUID id;
    private LocalDate date;
    private LocalTime time;
    private int numberOfAvailableTickets;
    private int numberOfSoldTickets;
    private String location;

    private UUID artistID;

    public Concert(UUID id, LocalDate date, LocalTime time, String location, int numberOfAvailableTickets, int numberOfSoldTickets, UUID artistID) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.numberOfAvailableTickets = numberOfAvailableTickets;
        this.numberOfSoldTickets = numberOfSoldTickets;
        this.location = location;
        this.artistID = artistID;
    }

    public Concert(LocalDate date, LocalTime time, String location, int numberOfAvailableTickets, int numberOfSoldTickets, UUID artistID) {
        this.id = UUID.randomUUID();
        this.date = date;
        this.time = time;
        this.numberOfAvailableTickets = numberOfAvailableTickets;
        this.numberOfSoldTickets = numberOfSoldTickets;
        this.location = location;
        this.artistID = artistID;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void setID(UUID uuid) {
        this.id=uuid;
    }

    @Override
    public UUID getID() {
        return this.id;
    }

    public UUID getArtistID() {
        return artistID;
    }

    public void setArtistID(UUID artistID) {
        this.artistID = artistID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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

    @Override
    public String toString() {
        return "Concert{" +
                "id=" + id +
                ", date=" + date +
                ", numberOfAvailableTickets=" + numberOfAvailableTickets +
                ", numberOfSoldTickets=" + numberOfSoldTickets +
                ", artistID=" + artistID +
                ", location=" + location +
                '}';
    }
}
