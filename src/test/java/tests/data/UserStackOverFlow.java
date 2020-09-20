package tests.data;

public enum UserStackOverFlow {
    EMAIL("autotest@1secmail.com"),
    PASSWORD("Test1Test1");

    private final String value;

    UserStackOverFlow(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
