
package aula11;

public class Main {
   
    public static void main(String[] args) {
        
        
        /* 
        Visitante v1 = new Visitante();
        v1.setNome("Joao");
        v1.setIdade(33);
        v1.setGenero("M");
        
        System.out.println(v1.toString());
        */
        
        /*
        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        a1.setMatricula(124983);
        a1.setIdade(16);
        a1.setGenero("F");
        a1.setCurso("Informatica");
        a1.pagarMensalidade();
        
        System.out.println(a1.toString());
        */
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Claudio");
        b1.setIdade(17);
        b1.setGenero("M");
        b1.setMatricula(138459);
        b1.setCurso("Informatica");
        b1.setBolsa(45.5f);
        b1.renovarBolsa();
        b1.pagarMensalidade();
        
        System.out.println(b1.toString());
        
        
    }
}
