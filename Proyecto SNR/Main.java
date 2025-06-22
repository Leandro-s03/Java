import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Attach usando el constructor con parámetros
        Attach archivo = new Attach(
            1,                              // idAttach
            "/docs/prueba.pdf",            // filePath
            "PDF",                          // fileType
            101,                            // idClaim
            5,                              // idAttachmentType
            12,                             // idUser
            2048,                           // fileSize en KB
            LocalDateTime.now(),           // uploadDate
            false,                          // isDeleted
            "Documento importante",        // description
            "activo"                        // status
        );

        // Usar los métodos de la clase Attach
        archivo.createAttach();
        archivo.readAttachment();

        // Actualizar datos
        archivo.updateAttachment("/docs/nueva-version.pdf", "Versión actualizada");
        archivo.readAttachment();

        // Marcar como eliminado
        archivo.deleteAttachment();
    }
}
