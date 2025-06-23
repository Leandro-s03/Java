import java.time.LocalDate;

public class Claim {
    // Atributos
    private int idClaim;
    private String typeClaim;
    private int attachId;
    private int categoryId;
    private int createId;
    private int updateId;
    private LocalDate dateCreate;
    private LocalDate dateUpdate;
    private String description;
    private String title;

    // Constructor
    public Claim(int idClaim, String typeClaim, int attachId, int categoryId,
            int createId, int updateId, LocalDate dateCreate, LocalDate dateUpdate,
            String description, String title) {
        this.idClaim = idClaim;
        this.typeClaim = typeClaim;
        this.attachId = attachId;
        this.categoryId = categoryId;
        this.createId = createId;
        this.updateId = updateId;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
        this.description = description;
        this.title = title;
    }

    // Getters y Setters
    public int getIdClaim() {
        return idClaim;
    }

    public void setIdClaim(int idClaim) {
        this.idClaim = idClaim;
    }

    public String getTypeClaim() {
        return typeClaim;
    }

    public void setTypeClaim(String typeClaim) {
        this.typeClaim = typeClaim;
    }

    public int getAttachId() {
        return attachId;
    }

    public void setAttachId(int attachId) {
        this.attachId = attachId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getCreateId() {
        return createId;
    }

    public void setCreateId(int createId) {
        this.createId = createId;
    }

    public int getUpdateId() {
        return updateId;
    }

    public void setUpdateId(int updateId) {
        this.updateId = updateId;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public LocalDate getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDate dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Métodos simulados (en la práctica, estos interactuarían con la base de datos)
    public void create() {
        System.out.println("Reclamo creado: " + this.title);
    }

    public void read() {
        System.out.println("ID: " + idClaim);
        System.out.println("Título: " + title);
        System.out.println("Tipo: " + typeClaim);
        System.out.println("Descripción: " + description);
        System.out.println("Fecha de creación: " + dateCreate);
        System.out.println("Fecha de actualización: " + dateUpdate);
    }

    public void update(String newTitle, String newDescription, int newUpdateId) {
        this.title = newTitle;
        this.description = newDescription;
        this.updateId = newUpdateId;
        this.dateUpdate = LocalDate.now();
        System.out.println("Reclamo actualizado.");
    }

    public void delete() {
        System.out.println("Reclamo con ID " + idClaim + " eliminado (simulado).");
    }
}
