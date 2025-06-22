public class MainLocation {
    public static void main(String[] args) {
        // ==== TEST DE ATTACH ====
        Attach archivo = new Attach(
            1,
            "/docs/prueba.pdf",
            "PDF",
            101,
            5,
            12,
            2048,
            java.time.LocalDateTime.now(),
            false,
            "Documento importante",
            "activo"
        );

        archivo.createAttach();
        archivo.readAttachment();
        archivo.updateAttachment("/docs/nueva-version.pdf", "Versión actualizada");
        archivo.readAttachment();
        archivo.deleteAttachment();

        System.out.println("================================");

        // ==== TEST DE LOCATION ====
        int idUsuarioQueCrea = 1;
        int idUsuarioQueModifica = 2;

        Location loc = new Location(
            1,
            10,
            "Calle Falsa",
            "1234",
            "Frente a la plaza",
            0,
            0,
            null,
            null
        );

        loc.create(idUsuarioQueCrea);
        loc.read();
        loc.update(idUsuarioQueModifica);
        loc.read();
        loc.delete();
    }
}
