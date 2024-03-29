package Aula09;

public class Desafio7C {
    public static void main(String[] args) {
        String conteudo = "  teste  123  ";
        
       
        conteudo = conteudo.trim();
        
        
        conteudo = conteudo.replaceAll("\\s+", " ");
        
        System.out.println(conteudo);
    }
}
