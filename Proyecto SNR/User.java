import java.time.LocalDateTime;
//Clase User
public class User {
    //atributos 
    private int id;
    private String nombre;
    private String email; 
//constructor
    public User (int id, String nombre, String email){

        this.id=id;
        this.nombre=nombre;
        this.email=email;
        }
//Get y Set
    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEmail(){
        return email;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setEmail(String email){
        this.email=email;
    }
// metodo
    public void createUser(int newId, String newNombre, String newEmail){
        this.id=newId;
        this.nombre=newNombre;
        this.email=newEmail;
    }
    
    
}
