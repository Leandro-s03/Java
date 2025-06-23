package Pueba;

public class Persona2 {
    String nombre;
    int edad;
    int dni;
    String direccion;

    // constructor
    public Persona2(String nombre, int edad, int dni, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.direccion = direccion;
    }

    // Metodo saludar
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años");
    }

    // muestra direccion y DNI
    public void datos() {
        System.out.println("Mi direccion es " + direccion + " y mi dni es: " + dni);
    }

    public static void main(String[] args) {
        Persona2 p1 = new Persona2("Leandro", 26, 41660874, "Cipriano Morales 79");
        Persona2 p2 = new Persona2("Martin", 25, 30654321, "Montecaseros");
        Persona2 p3 = new Persona2("Maria Paz", 22, 27123456, "Rivadavia");
        System.out.println();
        p1.saludar();
        p1.datos();
        System.out.println();
        p2.saludar();
        p2.datos();
        System.out.println();
        p3.saludar();
        p3.datos();

    }
}