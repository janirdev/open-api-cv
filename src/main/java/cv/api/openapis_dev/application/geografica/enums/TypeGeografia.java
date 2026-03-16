package cv.api.openapis_dev.application.geografica.enums;

public enum TypeGeografia {
    ILHA("ILHA"),
    PAIS("PAIS"),
    CONCELHO("CONCELHO"),
    FREGUESIA("FREGUESIA"),
    ZONA("ZONA");
    
    private final String description;

    TypeGeografia(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
