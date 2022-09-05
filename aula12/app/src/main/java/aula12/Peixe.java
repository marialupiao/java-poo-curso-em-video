
package aula12;

public class Peixe extends Animal {
    
    private String corEscama;
    
    public void soltarBolhas() {
        System.out.println("Soltando bolhas");
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo algas");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Sons de peixes na agua");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int getMembros() {
        return membros;
    }

    @Override
    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
  
}
