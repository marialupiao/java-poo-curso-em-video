
package aula10;

public class Main {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p1.setGenero("M");
        p1.setIdade(15);
        
        p2.setNome("Maria");
        p2.setGenero("F");
        p2.setIdade(13);
        p2.setCurso("Ensino Fundamental");
        p2.setMatricula(251498);
        
        p3.setNome("Claudio");
        p3.setGenero("M");
        p3.setIdade(42);
        p3.setEspecialidade("Professor de Literatura");
        p3.setSalario(2500.0f);
        
        p4.setNome("Fabiana");
        p4.setGenero("F");
        p4.setIdade(35);
        p4.setSetor("Administrativo");
        p4.setTrabalhando(true);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
        
    }
}
