import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ConverterMoeda converter = new ConverterMoeda();
        Scanner escolhaOpcao = new Scanner(System.in);
        boolean showMenu = true;
        MensagemInicial chatInicial = new MensagemInicial();
        MensagemFinal chatFinal = new MensagemFinal();
        Menu menu  = new Menu();
        chatInicial.mensagem();
        menu.exibeMenu();
        while (showMenu) {
            String opcao = escolhaOpcao.nextLine();
            switch (opcao) {
                case "1":
                    converter.converter("BRL", "USD");
                    System.out.println(converter.getValorDigitado() + "              Real Brasileiro" );
                    System.out.println(converter.getResultadoConversao() + "             Dolar Americano");
                    break;
                case "2":
                    converter.converter("USD", "BRL");
                    System.out.println(converter.getValorDigitado() + "              Dolar Americano");
                    System.out.println(converter.getResultadoConversao() + "             Real brasileiro");
                    break;
                case "3":
                    converter.converter("BRL", "EUR");
                    System.out.println(converter.getValorDigitado() + "              Real Brasileiro" );
                    System.out.println(converter.getResultadoConversao() + "             Euro");
                   // chatintermediario.mensagem();
                    break;
                case "4":
                    converter.converter("EUR", "BRL");
                    System.out.println(converter.getValorDigitado() + "              Euro" );
                    System.out.println(converter.getResultadoConversao() + "             Real Brasileiro");
                    break;
                case "5":
                    converter.converter("BRL", "RUB");
                    System.out.println(converter.getValorDigitado() + "              Real Brasileiro" );
                    System.out.println(converter.getResultadoConversao() + "             Rublo Russo");
                    break;
                case "6":
                    converter.converter("RUB", "BRL");
                    System.out.println(converter.getValorDigitado() + "              Rublo Russo" );
                    System.out.println(converter.getResultadoConversao() + "             Real brasileiro");
                    break;
                case "7":
                    converter.converter("BRL", "ARS");
                    System.out.println(converter.getValorDigitado() + "              Real Brasileiro" );
                    System.out.println(converter.getResultadoConversao() + "             Peso Argentino");
                    break;
                case "8":
                    converter.converter("ARS", "BRL");
                    System.out.println(converter.getValorDigitado() + "              Peso Argentino" );
                    System.out.println(converter.getResultadoConversao() + "             Real Brasileiro");
                    break;
                case "9":
                    showMenu = false;
                    chatFinal.mensagem();
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }
    }
}
