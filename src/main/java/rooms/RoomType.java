package rooms;

public enum RoomType {

    SINGLE(1, 15),
    DOUBLE(2,20),
    TRIPLE(3, 30),
    FAMILY(4, 50);

    private final int value;
    private final int nightlyRate;

    RoomType(int value, int nightlyRate) {
        this.value = value;
        this.nightlyRate = nightlyRate;
    }

    public int getValue() {
        return value;
    }

    public int getNightlyRate(){
        return nightlyRate;
    }
}
