package tests.data;

public enum ItPlatformaUser {
    USER("Test12"),
    USER2("Test13"),
    EMAIL("Email12@gmail.com"),
    EMAIL2("Email13@gmail.com"),
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
