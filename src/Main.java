void main() {

    /*        System.out.println("Hello World");

    // Exercice 1

    char Caractere = 'a';
    int Entier = 1;
    long EntierLong = 100000000;
    float NbVirgule = 1.5F;
    double GrosNbVirgule = 1.999999999999999;
    boolean VraiFaux = true;
    String ChaineChar = "abcdefg";

    System.out.println(Caractere);
    System.out.println(Entier);
    System.out.println(EntierLong);
    System.out.println(NbVirgule);
    System.out.println(GrosNbVirgule);
    System.out.println(VraiFaux);
    System.out.println(ChaineChar);

    // Exercice 2

    String Nom = "Dupont";
    String Prenom = "Pierre";
    String NomComplet = Prenom + " " + Nom;

    int AnneeDeNaissance = 2002;
    int age = 2026 - AnneeDeNaissance;

    System.out.println(NomComplet + " est né en " + AnneeDeNaissance + " il a donc " + age + " ans");

    // Exercice 3

    int a = 5;
    int b = 10;

    if (a == b) {
        System.out.println("a = b");
    } else {
        System.out.println("a et b sont différents");
    } */

    // Exercice 4

    int a = 3, b = 11, c = 5, d = 8;

    System.out.println("1 : (a == b) -> " + (a == b));
    System.out.println("2 : (b == a + d) -> " + (b == a + d));
    System.out.println("3 : (b == a + d) && (a == b) -> " + ((b == a + d) && (a == b)));
    System.out.println("4 : (b == a) || (a == a) -> " + ((b == a) || (a == a)));
    System.out.println("5 : (c == 5) && false -> " + ((c == 5) && false));
    System.out.println("6 : ((4 == 4) && (4 == 5)) || (a == a) -> " + (((4 == 4) && (4 ==5)) || (a == a)));

}