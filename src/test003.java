
public class test003 {
    public static void main(String[] args) {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1;  // Incrementa K
            SOMA = SOMA + K;  // Adiciona K à SOMA
        }

        System.out.println(SOMA);  // Imprime o valor de SOMA
    }
}
