package tests.data;

public enum ItPlatformaUser {
    USER("Test10"),
    USER2("Test11"),
    EMAIL("Email10@gmail.com"),
    EMAIL2("Email11@gmail.com"),
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
