package br.com.conversormoedas;

import br.com.conversormoedas.chatBot.SimularChatBot;
import br.com.conversormoedas.principal.Principal;

public class ConversorMoedasApplication {

    public static void main(String[] args) {

        SimularChatBot.chatBot("Olá seja bem vindo ao conversor de moedas V1.0, sou sua assistente virtual");
        SimularChatBot.chatBot("Qual conversão você quer fazer?");

        Principal.exibeMenu();
    }
}