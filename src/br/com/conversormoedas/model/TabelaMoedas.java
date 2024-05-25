package br.com.conversormoedas.model;

import java.io.Serializable;
import java.util.Map;

public class TabelaMoedas {

    public Serializable moedas(String moeda) {
        Map<String, String> tabela = Map.ofEntries(Map.entry("BRL", "Real brasileiro"),
                Map.entry("USD", "Dólar americano"),
                Map.entry("EUR", "Euro"),
                Map.entry("RUB", "Rublo russo"),
                Map.entry("ARS", "Peso argentino"));
        return tabela.get(moeda);
    }
}

