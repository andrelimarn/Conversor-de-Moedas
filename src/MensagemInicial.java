import java.util.ArrayList;

public class MensagemInicial {

    public void mensagem() {
        Menu menu = new Menu();
        Digitacao digitacao = new Digitacao();
        ArrayList<String> mensagem = new ArrayList();
        mensagem.add("Olá seja bem vindo ao conversor de moedas V1.0, sou sua assistente virtual");
        mensagem.add("Qual conversão você quer fazer?");
        for (String s : mensagem) {
            digitacao.simularDigitacao();
            System.out.println(s);
        }
    }
}


