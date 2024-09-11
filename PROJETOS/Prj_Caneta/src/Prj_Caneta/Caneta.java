package Prj_Caneta;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta:" + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Quantidade de carga: " + this.carga);
        System.out.println("Tampada?: " + this.tampada);
    }

    void escrever(){
        if(this.tampada){
            System.out.println("Não posso escrever, estou tampada.");
        }else {
            System.out.println("Estou escrevendo");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
