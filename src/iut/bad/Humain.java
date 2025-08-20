package iut.bad;

public class Humain {
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
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }
}

