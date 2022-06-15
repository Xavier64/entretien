package CoursPOO;

public class OCSuite1 {
    
    public static void main(String[] args) {

        String nom1 ="Jean";
        String nom2 = nom1;

        nom1 = "Laurent";

        afficherNom(nom1);
        afficherNom(nom2);

        Personne personne1 = new Personne("Yoan");
        Personne personne2 = personne1;

        personne1.nom ="Claude";

        afficherNom(personne1.nom);
        afficherNom(personne2.nom);
        
        

    }
    static void afficherNom(String text){
        System.out.println("-> " + text);
    }

}

class Personne{
    String nom;

    Personne(String nom){
        this.nom = nom;
    }
}
