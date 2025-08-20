import iut.bad.Femme;
import iut.bad.Homme;

public class Main {
    public static void main(String[] args) {
        Homme jean = new Homme("Dupont", "Jean", 25);
        Femme marie = new Femme("Martin", "Marie", 23);

        jean.ami(marie);
        marie.ami(jean);


        System.out.println("Nom de Jean: " + jean.getNom());
        System.out.println("Prénom de Marie: " + marie.getPrenom());
        System.out.println("Âge de Jean: " + jean.getAge());
        System.out.println("Âge de Marie: " + marie.getAge());
    }
}