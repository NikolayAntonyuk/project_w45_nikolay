package tests.data;

public enum ItPlatformaUser {
    USER("Test22"),
    USER2("Test23"),
    USER3("Test24"),
    EMAIL("Email22@gmail.com"),
    EMAIL2("Email23@gmail.com"),
    EMAIL3("Email777@gmail.comEmail%&# @gmail.com"),
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
