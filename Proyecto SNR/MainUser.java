public class MainUser {
    public static void main(String[] args) {
        User usuarios = new User(1,"leo", "leo123@gmail.com");
    
    usuarios.createUser(1,"leo","leo123@gmail.com");
    
    System.out.println("Id:"+usuarios.getId());
    System.out.println("Nombre:"+usuarios.getId());
    System.out.println("email:"+usuarios.getId());

    }
}