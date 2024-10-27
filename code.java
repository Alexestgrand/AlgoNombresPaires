public class Main {
    public static void main(String[] args) {

        int nombre = 0;
        long resultat = 1;
        for (int i = 1; i <= nombre; i= i+1) {
            resultat = resultat* i;
        }
        System.out.println("La factorielle de " + nombre + " est " + resultat);
    }
}
