
package aula12;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("=================================================");
        Mamifero m1 = new Mamifero();
        
        m1.setPeso(85.3f);
        m1.setIdade(2);
        m1.setMembros(4);
        m1.setCorPelo("Caramelo");
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();
        
        
        System.out.println("=================================================");
        Reptil r1 = new Reptil();
        
        r1.setPeso(6);
        r1.setIdade(1);
        r1.setMembros(4);
        r1.setCorEscama("Verde");
        r1.alimentar();
        r1.emitirSom();
        r1.locomover();
        
        
        System.out.println("=================================================");
        Peixe p1 = new Peixe();
        
        p1.setIdade(10);
        p1.setPeso(15);
        p1.setCorEscama("Azul");
        p1.alimentar();
        p1.locomover();
        p1.soltarBolhas();
        p1.emitirSom();
        
        
        System.out.println("=================================================");
        Ave a1 = new Ave();
        
        a1.setIdade(5);
        a1.setPeso(2.40f);
        a1.setMembros(4);
        a1.setCorPena("Preto");
        a1.emitirSom();
        a1.alimentar();
        a1.fazerNinho();
        a1.locomover();
        
        
        System.out.println("=================================================");
        Canguru c1 = new Canguru();
        
        c1.setCorPelo("Marrom");
        c1.setIdade(5);
        c1.setPeso(80);
        c1.setMembros(4);
        c1.alimentar();
        c1.locomover();
        c1.usarBolsa();
        
        
        
        
    }
}
