package iut.bad;

public class Femme extends Humain{


    public Femme(String nom, String prenom, int age) {
        super(nom,prenom,age);
    }
    public static void main(String[] args) {
        Homme homme = new Homme("Dupont", "Jean", 25);
        Femme femme = new Femme("Martin", "Marie", 23);

        homme.ami(femme);
        femme.ami(homme);
    }

}