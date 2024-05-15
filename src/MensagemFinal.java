import java.util.ArrayList;

public class MensagemFinal {

    public void mensagem() {
        Digitacao digitacao = new Digitacao();
        ArrayList<String> mensagem = new ArrayList();
        mensagem.add("Foi um prazer poder ter te ajudado");
        mensagem.add("até a próxima ;)");
        for (String s : mensagem) {
            digitacao.simularDigitacao();
            System.out.println(s);
        }
    }
}
