
package ProjetoFinal;

public class Gafanhoto extends Pessoa {
    
    private String login;
    private int totalAssistido;

    public Gafanhoto(String login, String nome, int idade, String genero) {
        super(nome, idade, genero);
        this.login = login;
        this.totalAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto = {" + super.toString() + ", Login: " + login 
                + ", Total Assistido: " 
                + totalAssistido + '}';
    }

    
}
