
package Aula03;

public class Caneta {
 
    public String modelo;
    public String cor;             // ATRIBUTOS
    public float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);         // o this se refere
        System.out.println("Carga: " + this.carga);         // ao objeto
        System.out.println("Esta tampada? " + this.tampada);
    }
    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Nao posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    
    public void tampar() {                    // MÉTODOS
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
}
