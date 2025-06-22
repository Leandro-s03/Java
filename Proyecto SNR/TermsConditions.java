import java.time.LocalDateTime;

public class TermsConditions {
    private int idTerms;
    private String content;
    private LocalDateTime dateTerms;
    private boolean status;
    private int idUserCreate;
    private int idUserUpdate;
    private LocalDateTime dateCreate;
    private LocalDateTime dateUpdate;

    // Constructor
    public TermsConditions() {
        this.dateCreate = LocalDateTime.now();
        this.status = true;
    }

    // Métodos
    public void create(String content, int idUserCreate) {
        this.content = content;
        this.idUserCreate = idUserCreate;
        this.dateTerms = LocalDateTime.now();
        this.dateUpdate = LocalDateTime.now();
    }

    public void update(String newContent, int idUserUpdate) {
        this.content = newContent;
        this.idUserUpdate = idUserUpdate;
        this.dateUpdate = LocalDateTime.now();
    }

    public String read() {
        return content;
    }

    // Getters y setters
    public int getIdTerms() { return idTerms; }
    public void setIdTerms(int idTerms) { this.idTerms = idTerms; }

    // (Otros getters y setters opcionales)
}