package br.com.conversormoedas.chatBot;

public class SimularChatBot {

    public static void chatBot(String mensagem) {
        for (int i = 0; i < 3; i++) {
            System.out.print("\u001B[37mDigitando ");
            for (int j = 0; j < 3; j++) {
                System.out.print(".");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.print("\r");
        }
        System.out.println("\u001B[33m"+mensagem);
    }
}
