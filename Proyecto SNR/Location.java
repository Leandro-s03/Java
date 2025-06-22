import java.time.LocalDate;

public class Location {
    // Atributos
    private int idLocation;
    private int idDistrict;
    private String street;
    private String numeration;
    private String reference;
    private int idUserCreate;
    private int idUserUpdate;
    private LocalDate dateCreate;
    private LocalDate dateUpdate;

    // Constructor vacío
    public Location() {}

    // Constructor con parámetros
    public Location(int idLocation, int idDistrict, String street, String numeration, String reference,
                    int idUserCreate, int idUserUpdate, LocalDate dateCreate, LocalDate dateUpdate) {
        this.idLocation = idLocation;
        this.idDistrict = idDistrict;
        this.street = street;
        this.numeration = numeration;
        this.reference = reference;
        this.idUserCreate = idUserCreate;
        this.idUserUpdate = idUserUpdate;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
    }

    // Getters y Setters
    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    public int getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(int idDistrict) {
        this.idDistrict = idDistrict;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumeration() {
        return numeration;
    }

    public void setNumeration(String numeration) {
        this.numeration = numeration;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getIdUserCreate() {
        return idUserCreate;
    }

    public void setIdUserCreate(int idUserCreate) {
        this.idUserCreate = idUserCreate;
    }

    public int getIdUserUpdate() {
        return idUserUpdate;
    }

    public void setIdUserUpdate(int idUserUpdate) {
        this.idUserUpdate = idUserUpdate;
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

    // Métodos funcionales (simulan CRUD)

    public void create() {
        System.out.println("📌 Ubicación creada: " + street + " " + numeration);
    }

    public void read() {
        System.out.println("📍 Ubicación:");
        System.out.println("Calle: " + street + ", Número: " + numeration);
        System.out.println("Referencia: " + reference);
        System.out.println("Fecha de creación: " + dateCreate);
    }

    public void update(String newStreet, String newReference) {
        this.street = newStreet;
        this.reference = newReference;
        this.dateUpdate = LocalDate.now();
        System.out.println("🛠️ Ubicación actualizada.");
    }

    public void delete() {
        System.out.println("🗑️ Ubicación eliminada (simulada).");
    }
}
