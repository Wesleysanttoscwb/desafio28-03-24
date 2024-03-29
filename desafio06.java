package Aula09;

public class Desafio06 {
  public static void main(String[] args) {
	  String nome = "Feliz";
	  String sobrenome = "Feliz da vida";
	  String ultimonome = "Feliz de mais da conta tchê";
	  
	  String maiorstring = nome;
	  
	  if (sobrenome.compareTo(maiorstring)>0) {
		  maiorstring = sobrenome;
		  
	  }
	  
	  if (ultimonome.compareTo(maiorstring)>0) {
		  maiorstring = ultimonome;
	  }
	  
	  
	  
	  System.out.println("A maior string é:" + maiorstring);
  }
}
