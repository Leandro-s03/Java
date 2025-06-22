import java.time.LocalDateTime;

public class TermsAgree {
    private int idAgree;
    private int idTerms;
    private int idUser;
    private LocalDateTime dateAgree;
    private int idUserCreate;
    private int idUserUpdate;
    private LocalDateTime dateCreate;
    private LocalDateTime dateUpdate;

    // Constructor
    public TermsAgree() {
        this.dateCreate = LocalDateTime.now();
    }

    public void agreeTerms(int idUser) {
        this.idUser = idUser;
        this.dateAgree = LocalDateTime.now();
        this.dateUpdate = LocalDateTime.now();
    }

    public int getUserId() {
        return this.idUser;
    }

    // Getters y setters
    public int getIdAgree() { return idAgree; }
    public void setIdAgree(int idAgree) { this.idAgree = idAgree; }

    public void setIdTerms(int idTerms) { this.idTerms = idTerms; }

    // (Otros getters y setters opcionales)
}