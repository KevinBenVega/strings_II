import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto = sc.next();
        String procesados = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (procesados.indexOf(letra) == -1) {
                int contador = 0;
                for (int j = 0; j < texto.length(); j++) {
                    if (texto.charAt(j) == letra) {
                        contador++;
                    }
                }
                System.out.println(letra + ": " + contador);
                procesados += letra;
            }
        }

    }
}
