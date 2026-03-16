package cv.api.openapis_dev.application.geografica.enums;

public enum TypeGeografia {
    ILHA("ILHA"),
    PAIS("PAIS"),
    CONCELHO("CONCELHO"),
    FREGUESIA("FREGUESIA"),
    ZONA("ZONA");
    
    private final String descricao;

    TypeGeografia(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
