public class User {
    // atrubutos
    private int id;
    private String nombre;
    private String email;
    private String lastName;

    // constructor
    public User(int id, String nombre, String email, String lastName) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.lastName = lastName;
    }

    // get y set
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Metodo de actualizacion de datos
    public void update(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.lastName = lastName;

        System.out.println("Se actualizaron los siguientes datos ahora el identificador es: " + id + " y el nombre "
                + nombre + " con el apellido de " + lastName
                + " y correo electronico " + email);
    }

    // metodo mostrar datos
    public void mostrarDatos() {
        System.out.println("El identificador es: " + id + " y el nombre " + nombre + " con el apellido de " + lastName
                + " y correo electronico " + email);
    }

    public static void main(String[] args) {

        User usuario1 = new User(1, "Leandro", "leandro@gmail.com", "Seguel");
        System.out.println();
        // Utilizo el metodo mostrarDatos y lo muestro en pantalla.
        usuario1.mostrarDatos();
        System.out.println();
        // Utilizo el metodo Update para actualizar los datos anteriores y lo muestro en
        // pantalla.
        usuario1.update(55, "Leandro Ariel", "leandronuevocorreo@gmail.com");

        System.out.println();

        // GETTTER
        // utilizo el get para mostrar el valor de un atributo de un objeto, en este
        // caso el atributo nombre del objeto User.
        System.out.println("Este es el nombre cargado del usurio: " + usuario1.getNombre());
        // SETTER
        // utilizo el set para asignar un nuevo valor al atributo Nombre
        usuario1.setNombre("Juancito");
        // Muetro en pantalla el nombre actualizado.
        System.out.println("Nombre actualizado a: " + usuario1.getNombre());

    }
}
