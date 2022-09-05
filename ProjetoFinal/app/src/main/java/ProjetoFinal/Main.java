
package ProjetoFinal;

public class Main {

    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 02 de POO");
        v[2] = new Video("Aula 03 de POO");
        
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Joseal", "Jose Alfredo", 22, "M");
        g[1] = new Gafanhoto("Marilu", "Maria Lucia", 36, "F");
        
        /*
        System.out.println("\nVIDEOS\n---------------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println("\nGAFANHOTOS\n-----------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        */
        
        Visualizacao v1 = new Visualizacao(g[0], v[1]);
        v1.avaliar();
        System.out.println(v1.toString());
        
        Visualizacao v2 = new Visualizacao(g[1], v[2]);
        v2.avaliar(87.5f);
        System.out.println(v2.toString());
    }
}
