
package aula13;

public class Main {
   
    public static void main(String[] args) {
        
       Cachorro x = new Cachorro();
       Lobo y = new Lobo();
       
       x.emitirSom();
       y.emitirSom();
       
       Cachorro c = new Cachorro();
       
       c.reagir("Vamos passear");
       c.reagir("Vai apanhar");
       c.reagir(11, 45);
       c.reagir(21, 00);
       c.reagir(true);
       c.reagir(false);
       c.reagir(2, 12.5f);
       c.reagir(15, 4.5f);

    }
}
