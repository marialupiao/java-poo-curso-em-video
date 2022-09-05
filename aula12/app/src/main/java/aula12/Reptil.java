
package aula12;


public class Reptil extends Animal {
    
    private String corEscama;
    
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo insetos");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Sons de repteis");
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
