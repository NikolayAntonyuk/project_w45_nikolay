package kolya.Task5.data;

public enum Projects {
    GOOGLE_MAIN_PAGE("https://www.google.com/"),
    STACKOVERFLOW_MAIN_PAGE("https://ru.stackoverflow.com/"),

    MK_MAIN_PAGE("https://account.kyivstar.ua/"),
    MK_OFFERS_PAGE("https://new.kyivstar.ua/ecare/offers");

    private final String value;

    Projects(String value) {
        this.value = value;
    }

    public String getUrl() {
        return value;
    }
}
