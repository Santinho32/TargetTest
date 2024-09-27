import java.util.Scanner;

    public class test005 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Simulação dos interruptores e lâmpadas
            boolean[] interruptores = {false, false, false}; // 0: desligado, 1: ligado
            boolean[] lampadas = {false, false, false}; // Estado das lâmpadas

            System.out.println("Você tem 3 interruptores e 3 lâmpadas.");

            // Passo 1: Ligar o primeiro interruptor
            System.out.println("Ligue o primeiro interruptor.");
            interruptores[0] = true;

            // Simulando o tempo em que a lâmpada está ligada
            System.out.println("Aguarde 5 minutos... (pressione Enter para continuar)");
            scanner.nextLine();

            // Passo 2: Desligar o primeiro interruptor e ligar o segundo
            interruptores[0] = false;
            System.out.println("Desligue o primeiro interruptor e ligue o segundo.");
            interruptores[1] = true;

            // Simulação do estado das lâmpadas
            // Para o exemplo, vamos supor que a primeira lâmpada acende,
            // a segunda e a terceira estão apagadas.
            lampadas[0] = true; // Primeira lâmpada está acesa (controlada pelo segundo interruptor)
            lampadas[1] = false; // Segunda lâmpada apagada (controlada pelo primeiro interruptor)
            lampadas[2] = false; // Terceira lâmpada apagada (controlada pelo terceiro interruptor)

            // Passo 3: "Vá até as salas das lâmpadas"
            System.out.println("Agora você vai até as salas das lâmpadas.");

            // Identificação das lâmpadas
            for (int i = 0; i < 3; i++) {
                if (lampadas[i]) {
                    System.out.println("A lâmpada " + (i + 1) + " está ACESA e é controlada pelo segundo interruptor.");
                } else {
                    System.out.println("A lâmpada " + (i + 1) + " está APAGADA.");
                }
            }

            // Identificando a lâmpada controlada pelo primeiro interruptor
            System.out.println("A lâmpada que está apagada e quente é controlada pelo primeiro interruptor.");
            System.out.println("A lâmpada que está apagada e fria é controlada pelo terceiro interruptor.");

            scanner.close();
        }
    }


