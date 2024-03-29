package Aula09;
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
    	Scanner Scanner = new Scanner(System.in);
    	System.out.println("Digite o nome da sua cidade:");
    	String cidade = Scanner.nextLine();
    	
    	if (cidade.equalsIgnoreCase("curitiba")) {
    		System.out.println("A cidade digitada é Curitiba");
  
    	} else {
    		System.out.println("Acidade digitada não é curitiba");
    	}
    	
    	Scanner.close();
    }
}
