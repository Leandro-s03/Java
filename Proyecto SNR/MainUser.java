
public class MainUser {
    public static void main(String[] args) {
        User usuario = new User(1, "Leo", "leo123@gmail.com");

        System.out.println("Id: " + usuario.getId());
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
    }
}
