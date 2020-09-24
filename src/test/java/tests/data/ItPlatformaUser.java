package tests.data;

public enum ItPlatformaUser {
    USER("Test3"),
    USER2("Test4"),
    EMAIL("Email3@gmail.com"),
    EMAIL2("Email4@gmail.com"),
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
