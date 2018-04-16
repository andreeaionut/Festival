import java.util.UUID;

public class Artist implements HasID<UUID> {
    private UUID id;
    private String name;

    public Artist(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public Artist(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    @Override
    public void setID(UUID uuid) {
        this.id = uuid;
    }

    @Override
    public UUID getID() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
