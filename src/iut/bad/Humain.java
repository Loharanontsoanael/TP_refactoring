package iut.bad;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;

    public Humain (){
    }


    public Humain (String nom, String prenom , int age ) {
        this.nom = nom ;
        this.prenom = prenom ;
        this.age = age ;
    }


    //details
    public void details() {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }

    @Override
    public void boire(){
        System.out.println("Je bois");
    }
    @Override
    public void manger(){
        System.out.println("Je mange");
    }

    public void ami(Humain autreHumain) {
        ami(autreHumain, 100); // Valeur par défaut
    }

    public void ami(Humain autreHumain, int dureeJours) {
        System.out.println("Je suis ami avec " + autreHumain.toString() +
                " depuis " + dureeJours + " jours");
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }
}