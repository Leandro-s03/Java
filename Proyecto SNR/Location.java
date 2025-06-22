import java.util.Date;

public class Location {
    private int id_location;
    private int id_district;
    private String street;
    private String numeration;
    private String reference;
    private int id_user_create;
    private int id_user_update;
    private Date date_create;
    private Date date_update;

    // Constructor
    public Location(int id_location, int id_district, String street, String numeration, String reference,
                    int id_user_create, int id_user_update, Date date_create, Date date_update) {
        this.id_location = id_location;
        this.id_district = id_district;
        this.street = street;
        this.numeration = numeration;
        this.reference = reference;
        this.id_user_create = id_user_create;
        this.id_user_update = id_user_update;
        this.date_create = date_create;
        this.date_update = date_update;
    }

    // ✅ Getters y setters corregidos

    public int getId_location() {
        return id_location;
    }

    public void setId_location(int id_location) {
        this.id_location = id_location;
    }

    public int getId_district() {
        return id_district;
    }

    public void setId_district(int id_district) {
        this.id_district = id_district;
    }

    // ❌ ERROR: antes usaba int en vez de String
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

    public int getId_user_create() {
        return id_user_create;
    }

    public void setId_user_create(int id_user_create) {
        this.id_user_create = id_user_create;
    }

    // ❌ ERROR: antes usaba int, ahora se usa Date
    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }

    public int getId_user_update() {
        return id_user_update;
    }

    public void setId_user_update(int id_user_update) {
        this.id_user_update = id_user_update;
    }

    public Date getDate_update() {
        return date_update;
    }

    public void setDate_update(Date date_update) {
        this.date_update = date_update;
    }

    // ❌ ERROR: mal escrito "tostring" → debe ser toString (con S mayúscula)
    @Override
    public String toString() {
        return "Location{" +
                "id_location=" + id_location +
                ", id_district=" + id_district +
                ", street='" + street + '\'' +
                ", numeration='" + numeration + '\'' +
                ", reference='" + reference + '\'' +
                ", id_user_create=" + id_user_create +
                ", id_user_update=" + id_user_update +
                ", date_create=" + date_create +
                ", date_update=" + date_update +
                '}';
    }

    public void create(int idUsuarioActual) {
        this.id_user_create = idUsuarioActual;
        this.date_create = new Date(); // Fecha actual
        System.out.println("Ubicación creada por usuario ID: " + idUsuarioActual + " en " + this.date_create);
    }

    public void read() {
        System.out.println(this.toString());
    }

    public void update(int idUsuarioActual) {
        this.id_user_update = idUsuarioActual;
        this.date_update = new Date(); // Fecha actual
        System.out.println("Ubicación actualizada por usuario ID: " + idUsuarioActual + " en " + this.date_update);
    }

    public void delete() {
        System.out.println("Ubicación eliminada: " + this.toString());
    }
}
