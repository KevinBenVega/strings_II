import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto:");
        String cadenaTexto = sc.nextLine();

        System.out.println(cadenaTexto);
        System.out.println(cadenaTexto.length());

    }
}
