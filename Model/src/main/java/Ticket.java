import java.util.HashMap;
import java.util.UUID;

public class Ticket implements HasID<UUID>{
    private UUID id;
    private String customerName;
    private int numberOfSeats;
    private UUID concertID;

    public Ticket(UUID id, String customerName, int numberOfSeats, UUID concertID) {
        this.id = id;
        this.customerName = customerName;
        this.numberOfSeats = numberOfSeats;
        this.concertID = concertID;
    }

    public Ticket(String customerName, int numberOfSeats, UUID concertID) {
        this.id = UUID.randomUUID();
        this.customerName = customerName;
        this.numberOfSeats = numberOfSeats;
        this.concertID = concertID;
    }

    @Override
    public void setID(UUID uuid) {
        this.id = uuid;
    }

    @Override
    public UUID getID() {
        return this.id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public UUID getConcertID() {
        return concertID;
    }

    public void setConcertID(UUID concertID) {
        this.concertID = concertID;
    }
}
