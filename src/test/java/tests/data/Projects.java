package tests.data;

public enum Projects {
    ITPLATFORMA_MAIN_PAGE("https://it-platforma.website/");


    private final String value;

    Projects(String value) {
        this.value = value;
    }

    public String getUrl() {
        return value;
    }
}

