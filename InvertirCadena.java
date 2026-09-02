import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto para invertir: ");
        String original = scanner.nextLine();

        StringBuilder invertida = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida.append(original.charAt(i));
        }

        System.out.println("Cadena invertida: " + invertida.toString());

        scanner.close();
    }
}