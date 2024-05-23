public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Bonjour et bon courage dans votre examen en DevOps.");

        int a = 5;
        int b = 3;
        int result = sum(a, b);
        System.out.println("La somme de " + a + " et " + b + " est: " + result);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
