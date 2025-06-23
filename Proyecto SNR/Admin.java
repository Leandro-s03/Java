public class Admin extends User {
    // atributos
    private String nivelPermiso;

    // constructor
    public Admin(int id, String nombre, String email, String lastName, String nivelPermiso) {
        super(id, nombre, email, lastName);
        this.nivelPermiso = nivelPermiso;
    }
    // getter y setter

    public String getNivelPermiso() {
        return nivelPermiso;
    }

    public void setNivelPermiso() {
        this.nivelPermiso = nivelPermiso;
    }

    // Metodo mostrar Permiso
    public void mostrarPermiso() {
        System.out.println("Nivel de Permiso: " + nivelPermiso);
    }

    // pasamos valores y mostramos en terminal
    public static void main(String[] args) {
        System.out.println();
        Admin admin1 = new Admin(1, "Administrador", "lealeaseguel@gmail", "seguel", "ALTO");
        admin1.mostrarDatos();
        admin1.mostrarPermiso();
        System.out.println();
        Admin admin2 = new Admin(2, "tomas", "tomas@gmail.com", "gomez", "MEDIO");
        admin2.mostrarPermiso();
        admin2.mostrarDatos();
    }
}
