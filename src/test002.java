import java.util.Scanner;

//Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
// além de informar a quantidade de vezes em que ela ocorre.

public class test002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();
        scanner.close();

        int count = countLetterA(input);
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    public static int countLetterA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
