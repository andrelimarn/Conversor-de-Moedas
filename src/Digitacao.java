public class Digitacao {

    public void simularDigitacao () {
        for (int i = 0; i < 3; i++) {
            System.out.print("\u001B[32mDigitando ");
            for (int j = 0; j < 3; j++) {
                System.out.print(".");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.print("\r");
        }
    }
}
