import java.util.Scanner;

class ContadorDeVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        scanner.close();

        int contadorVogais = contarVogais(frase);
        System.out.println("Número de vogais na frase: " + contadorVogais);
    }

    public static int contarVogais(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
}