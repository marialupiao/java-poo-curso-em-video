
package aula11;

public abstract class Pessoa {
    
    protected String nome;
    protected int idade;
    protected String genero;
    
    
    public void fazerAniversario() {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Dados: {" + "nome = " + nome + ", idade = " + idade 
                + ", genero = " + genero + '}';
    }
    
    
    
}
