package br.com.conversormoedas.service;

import br.com.conversormoedas.chatBot.SimularChatBot;
import br.com.conversormoedas.model.DadosCoversorApi;
import br.com.conversormoedas.model.TabelaMoedas;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conversor {

    private final ConsumoApi API = new ConsumoApi();
    private final String ENDERECO = "https://v6.exchangerate-api.com/v6/";
    private final String APIKEY = "4212c926ef801918e0b0c8f4";
    private List<String> logConversoes = new ArrayList<String>();

    public void converter(String moedaBase, String moedaAlvo) {
        TabelaMoedas moedas = new TabelaMoedas();
        String valor;
        SimularChatBot.chatBot("Digite o valor que você quer converter");
        Scanner escolhaValor = new Scanner(System.in);
        valor = escolhaValor.nextLine();
        var json = API.obterDados(ENDERECO + APIKEY + "/pair/" + moedaBase + "/" + moedaAlvo + "/" + valor.replace(",", "."));

        Gson gson = new Gson();
        DadosCoversorApi dados = gson.fromJson(json, DadosCoversorApi.class);

        String resultadoConversao = ("""
               %s %s é igual a %s %s
               ----------------------------------------------------------------
               """.formatted(valor, moedas.moedas(moedaBase), dados.conversion_result(), moedas.moedas(moedaAlvo)));

        SimularChatBot.chatBot(resultadoConversao);
        logConversoes.add(resultadoConversao);

        SimularChatBot.chatBot("Escolha uma opção se quiser fazer outra conversão, ou 10 para encerrar a conversa");

    }

    public void imprimeLog () {
        SimularChatBot.chatBot("Essas foram as conversões que você fez:");
        logConversoes.forEach(System.out::println);
    }

}
