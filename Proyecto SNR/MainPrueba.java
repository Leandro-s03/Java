import java.time.LocalDate;

public class MainPrueba {
    public static void main(String[] args) {
        // Creamos el usuario que hará el reclamo
        User usuario = new User(1, "Juan", "juan123@gmail.com");

        // Creamos la ubicación
        Location ubicacion = new Location(
                3, // id_location
                12, // id_district
                "Calle Falsa", // street
                "123", // numeration
                "Frente a la plaza", // reference
                usuario.getId(), // id_user_create
                usuario.getId(), // id_user_update
                new java.util.Date(), // date_create
                new java.util.Date() // date_update
        );

        // Creamos el reclamo
        Claim reclamo = new Claim(
                0, // idClaim
                "Reclamo técnico", // typeClaim
                0, // attachId (por ahora sin archivo)
                5, // categoryId
                usuario.getId(), // createId
                usuario.getId(), // updateId
                LocalDate.now(), // dateCreate
                LocalDate.now(), // dateUpdate
                "Sin luz en la cuadra", // description
                "Corte de energía" // title
        );

        // Mostramos los datos del reclamo
        reclamo.read();
        ubicacion.read();
    }
}
