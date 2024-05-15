import java.util.ArrayList;

public class MensagemIntermediaria {
    public void mensagem() {
        Menu menu = new Menu();
        Digitacao digitacao = new Digitacao();
        ArrayList<String> mensagem = new ArrayList();
        mensagem.add("Escolha uma opção");
        for (String s : mensagem) {
            digitacao.simularDigitacao();
            System.out.println(s);
        }
    }
}
