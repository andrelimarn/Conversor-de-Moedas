package br.com.conversormoedas.principal;

import br.com.conversormoedas.chatBot.SimularChatBot;
import br.com.conversormoedas.service.Conversor;
import java.util.Scanner;

public class Principal {

    public static void exibeMenu() {

        Conversor converterMoeda = new Conversor();

        System.out.printf("""
                       +----------------------------------------------------------+
                       | Escolha uma opção:                                       |
                       |                                                          |
                       | 1 - Real   ==> Dolar        6 - Rublo     ==> Real       |
                       | 2 - Dolar  ==> Real         7 - Real      ==> Peso(ARG)  |
                       | 3 - Real   ==> Euro         8 - Peso(ARG) ==> Real       |
                       | 4 - Euro   ==> Real         9 - Listar conversões        |
                       | 5 - Real   ==> Rublo        10 - Sair                    |
                       |                                                          |
                       +----------------------------------------------------------+
                       """);

        String opcao = "";

        while (!opcao.equals("10")) {
            Scanner escolhaOpcao = new Scanner(System.in);
            opcao = escolhaOpcao.nextLine();

            switch (opcao) {
                case "1":
                    converterMoeda.converter("BRL", "USD");
                    break;
                case "2":
                    converterMoeda.converter("USD", "BRL");
                    break;
                case "3":
                    converterMoeda.converter("BRL", "EUR");
                    break;
                case "4":
                    converterMoeda.converter("EUR", "BRL");
                    break;
                case "5":
                    converterMoeda.converter("BRL", "RUB");
                    break;
                case "6":
                    converterMoeda.converter("RUB", "BRL");
                    break;
                case "7":
                    converterMoeda.converter("BRl", "ARS");
                    break;
                case "8":
                    converterMoeda.converter("ARS", "BRL");
                    break;
                case "9":
                    converterMoeda.imprimeLog();
                    break;
                case "10":
                    SimularChatBot.chatBot("Foi um prazer poder ter te ajudado, até a próxima!");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }

    }
}