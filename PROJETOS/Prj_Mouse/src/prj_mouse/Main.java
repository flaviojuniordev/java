package prj_mouse;

public class Main {
    public static void main(String[] args) {

        Mouse g408 = new Mouse();
        g408.botoes = 6;
        g408.led = true;
        g408.sensor = "PMW3395";
        g408.peso = 60f;
        g408.tamanhodofio = 90f;
        g408.status();
        g408.acenderled(true);
        g408.trocarled();
        g408.apagarled();

        Mouse positivo = new Mouse();
        positivo.botoes = 3;
        positivo.led = false;
        positivo.sensor = "PMW3311";
        positivo.peso = 85f;
        positivo.tamanhodofio = 60f;
        positivo.status();
        positivo.acenderled(false);
        positivo.trocarled();
        positivo.apagarled();

    }
}