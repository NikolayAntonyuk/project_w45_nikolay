package tests.data;

public enum Projects {
    ITPLATFORMA_MAIN_PAGE("https://it-platforma.website/"),
    GOOGLE_MAIN_PAGE("https://www.google.com/"),
    STACKOVERFLOW_MAIN_PAGE("https://ru.stackoverflow.com/");

    private final String value;

    Projects(String value) {
        this.value = value;
    }

    public String getUrl() {
        return value;
    }
}
