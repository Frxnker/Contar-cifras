public class ContarCifras {
    public static void main(String[] args) {

        int n = 0;

        do {
            System.out.println("Introduce un número entero, de hasta 5 cifras: ");
            n = Integer.parseInt(System.console().readLine());
            
        } while (n < 0);
        

    }
}
