package br.senai.sp.jandira.moldel;


import br.senai.sp.jandira.Aluno;

public class App {

	public static void main(String[] args) {
		
	
		/*LocalDate dataNascimento = LocalDate.of(2004, 7, 14);*/ 
	
	
	Aluno Clebson = new Aluno();
	Clebson.getaltura();
	Clebson.getpeso();
	Clebson.getImc();
	System.out.println("Idade:" + Clebson.getperiodo());
	System.out.println("IMC:"+Clebson.getImc());
	System.out.println("Altura:"+Clebson.getaltura());
	System.out.println("Peso"+Clebson.getpeso());
	
	}
}
