public class Claim {
    // atrubutos
    private int idClaim;
    private String TypeClaim;
    private int attachId;
    private int categoryId;
    private int createId;
    private int updateId;
    private String title;

    // constructor
    public Claim(int idClaim, String TypeClaim, int attachId, int categoryId, int createId, int updateId, String title) {
        this.idClaim = idClaim;
        this.TypeClaim = TypeClaim;
        this.attachId = attachId;
        this.categoryId = categoryId;
        this.createId = createId;
        this.updateId = updateId;
        this.title = title;
    //setters y getters
   public int getIdClaim() {
        return idClaim;
    }

   public void setIdClaim(int idClaim) {
        this.idClaim = idClaim;
    }

    }

}