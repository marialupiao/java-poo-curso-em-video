
package aula12;

public class Canguru extends Mamifero {
    
    public void usarBolsa() {
        System.out.println("Filhote dentro da bolsa");
    }
    
    // SOBREPOSIÇÃO
    
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    
}
