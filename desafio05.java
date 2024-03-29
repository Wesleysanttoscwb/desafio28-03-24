package Aula09;
import java.util.Scanner;

public class Desafio05 {
	public static void main( String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Digite a nota do primeiro bimestre:");
		int nota1 = scanner.nextInt();
		
		System.out.println(" Digite a nota do segundo bimestre:");
		int nota2 = scanner.nextInt();
		
		int resultado = (nota1+nota2)/2;
		
		System.out.println("As suas notas foram:" + nota1 + " e " + nota2 + " " + " com média = " + resultado);
		
		scanner.close();
	}
	

}
