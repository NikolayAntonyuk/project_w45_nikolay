package tests.data;

public enum ItPlatformaUser{
    USER ("Test"),
    EMAIL("Email@gmail.com"),
    PASSWORD("TestTest");

    private final String value;

    ItPlatformaUser(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
