package os;

public class lab {
    private String id;
    private String roomName;

    public lab(String id, String roomName) {
        this.id = id;
        this.roomName = roomName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
