public class test004 {
    public static void main(String[] args) {
        // a) Números ímpares consecutivos
        int a = 7 + 2; // próximo número
        System.out.println("a) 1, 3, 5, 7, " + a);

        // b) Potências de 2
        int b = 64 * 2; // 2^7
        System.out.println("b) 2, 4, 8, 16, 32, 64, " + b);

        // c) Quadrados perfeitos
        int c = 36 + 13; // 7^2 = 49
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, " + c);

        // d) Quadrados de números pares
        int d = 10 * 10; // 10^2 = 100
        System.out.println("d) 4, 16, 36, 64, " + d);

        // e) Sequência de Fibonacci
        int e1 = 5, e2 = 8; // últimos números da sequência
        int e = e1 + e2; // próximo número
        System.out.println("e) 1, 1, 2, 3, 5, 8, " + e);

        // f) Sequência alternada
        int f = 19 + 1; // próximo número
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, " + f);
    }
}


