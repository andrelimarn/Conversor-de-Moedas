import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.Scanner;

public class ConverterMoeda {
    String API_KEY = "4212c926ef801918e0b0c8f4";
    private String valorDigitado;
    private String resultadoConversao;



    public void converter(String moedaBase, String moedaAlvo) {

            Digitacao digitacao = new Digitacao();
            Scanner digiteValor = new Scanner(System.in);

            digitacao.simularDigitacao();
            System.out.println("Informe o valor que você quer converter");
            String valor = digiteValor.next();

            String url_str = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + moedaBase + "/" + moedaAlvo + "/" + valor + "/";
            URL url;

            try {
                url = new URL(url_str);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            HttpURLConnection request;
            try {
                request = (HttpURLConnection) url.openConnection();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                request.connect();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            JsonParser jp = new JsonParser();
            JsonElement root;
            try {
                root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            JsonObject jsonobj = root.getAsJsonObject();
            String req_result = jsonobj.get("conversion_result").getAsString();
            digitacao.simularDigitacao();
            valorDigitado = valor;
            resultadoConversao = req_result;

      }

    public String getValorDigitado() {
        return valorDigitado;
    }

    public String getResultadoConversao() {
        return resultadoConversao;
    }
}
