package tests.data;

public enum ItPlatformaUser {
    USER("Test13"),
    USER2("Test14"),
    EMAIL("Email13@gmail.com"),
    EMAIL2("Email14@gmail.com"),
    PASSWORD("TestTest"),
    PASSWORD2("TestTest2");

    private final String value;

    ItPlatformaUser(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
