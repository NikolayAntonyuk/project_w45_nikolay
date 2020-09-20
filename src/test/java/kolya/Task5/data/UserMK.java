package kolya.Task5.data;

public enum UserMK {
    LOGIN("0689523663"),
    PASSWORD("pontis2020");

    private final String value;

    UserMK(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
