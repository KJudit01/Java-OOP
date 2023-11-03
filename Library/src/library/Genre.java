package library;

enum Genre {
    HORROR("romantic book"),
    ADVENTURE("adventure book"),
    ROMANTIC("horror story");

    private String displayName;

    Genre(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
