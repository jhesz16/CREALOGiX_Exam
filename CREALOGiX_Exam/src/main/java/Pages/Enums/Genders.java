package Pages.Enums;

public enum Genders {
    MR("Mr."),
    MS("Ms.");

    Genders() {
    }
    Genders(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String title;
}
