public class Menu {

    public void exibeMenu() {
        Digitacao  digitacao = new Digitacao();
        digitacao.simularDigitacao();
        System.out.printf("""
                       +----------------------------------------------------------+
                       | Escolha uma opção:                                       |
                       |                                                          |
                       | 1 - Real   ==> Dolar        6 - Rublo     ==> Real       |
                       | 2 - Dolar  ==> Real         7 - Real      ==> Peso(ARG)  |  
                       | 3 - Real   ==> Euro         8 - Peso(ARG) ==> Real       |
                       | 4 - Euro   ==> Real         9 - Sair                     |
                       | 5 - Real   ==> Rublo                                     |
                       |                                                          |
                       +----------------------------------------------------------+
                       """);
    }
}
