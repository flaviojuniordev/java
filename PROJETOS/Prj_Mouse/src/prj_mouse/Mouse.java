package prj_mouse;

public class Mouse {

    int botoes;
    String sensor;
    boolean led;
    float peso;
    float tamanhodofio;

    void status(){
        System.out.println("\n-------Status do Mouse--------");
        System.out.println("Este mouse tem " + this.botoes + " botões");
        System.out.println("O sensor utilizado: " + this.sensor);
        System.out.println("Led: " + this.led);
        System.out.println("Peso: " + this.peso + " gramas");
        System.out.println("Comprimento do fio: " + this.tamanhodofio + " centimetros");
    }

    void trocarled(){
        if(this.led){
            System.out.println("Led trocado com sucesso!");
        }else System.out.println("Desculpe, esse mouse não possui led");
    }

    void acenderled(boolean led){
        if(this.led){
            System.out.println("Seu led está aceso");
        }else System.out.println("Seu mouse não possui led");
    }

    void apagarled(){
            if(this.led){
                System.out.println("Seu led foi desligado");
            } else {
                System.out.println("Seu mouse não possui led");}
    }
}
