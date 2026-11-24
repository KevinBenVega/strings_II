import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el texto: ");
        String cadena = sc.next();

        if (cadena.length() < 2) {
            System.out.println("");
        } else {
            String resultado = cadena.substring(0, 2)
                    + cadena.substring(cadena.length() - 2);

            System.out.println(resultado);
        }
    }
}
