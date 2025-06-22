import java.time.LocalDateTime;

public class Attach {
    // Atributos
    private int idAttach;
    private String filePath;
    private String fileType;
    private int idClaim;
    private int idAttachmentType;
    private int idUser;
    private int fileSize;
    private LocalDateTime uploadDate;
    private boolean isDeleted;
    private String description;
    private String status;

    // Constructor vacío
    public Attach() {}

    // Constructor con parámetros
    public Attach(int idAttach, String filePath, String fileType, int idClaim, int idAttachmentType,
                  int idUser, int fileSize, LocalDateTime uploadDate, boolean isDeleted,
                  String description, String status) {
        this.idAttach = idAttach;
        this.filePath = filePath;
        this.fileType = fileType;
        this.idClaim = idClaim;
        this.idAttachmentType = idAttachmentType;
        this.idUser = idUser;
        this.fileSize = fileSize;
        this.uploadDate = uploadDate;
        this.isDeleted = isDeleted;
        this.description = description;
        this.status = status;
    }

    // Getters y Setters (algunos ejemplos)
    public int getIdAttach() {
        return idAttach;
    }

    public void setIdAttach(int idAttach) {
        this.idAttach = idAttach;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public int getIdClaim() {
        return idClaim;
    }

    public void setIdClaim(int idClaim) {
        this.idClaim = idClaim;
    }

    public int getIdAttachmentType() {
        return idAttachmentType;
    }

    public void setIdAttachmentType(int idAttachmentType) {
        this.idAttachmentType = idAttachmentType;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public LocalDateTime getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Métodos funcionales
    public void createAttach() {
        System.out.println("Archivo creado: " + filePath);
    }

    public void updateAttachment(String newFilePath, String newDescription) {
        this.filePath = newFilePath;
        this.description = newDescription;
        System.out.println("Archivo actualizado: " + idAttach);
    }

    public void deleteAttachment() {
        this.isDeleted = true;
        System.out.println("Archivo marcado como eliminado: " + idAttach);
    }

    public void readAttachment() {
        System.out.println("Archivo #" + idAttach + " (" + fileType + ") → " + filePath);
        System.out.println("Descripción: " + description + " | Estado: " + status);
    }
}
