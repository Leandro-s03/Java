public class MainMartin {
    public static void main(String[] args) {
        TermsConditions terms = new TermsConditions();
        terms.create("Estos son los términos y condiciones", 1);

        TermsAgree agreement = new TermsAgree();
        agreement.setIdTerms(terms.getIdTerms());
        agreement.agreeTerms(42); // ID del usuario que acepta

        System.out.println("Usuario " + agreement.getUserId() + " aceptó los términos.");
    }
}