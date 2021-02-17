package br.senai.sp.jandira.moldel;

import java.time.LocalDate;

import br.senai.sp.jandira.moldel.gui.Aluno;


public class App {

	public static void main(String[] args) {
		
	
		/*LocalDate dataNascimento = LocalDate.of(2004, 7, 14);*/ 
	
	
	Aluno Emerson = new Aluno();
	
	Emerson.setNome("Emerson");
	Emerson.setpeso(65);
	Emerson.setaltura(1.65);
	Emerson.setDataDeNascimento(LocalDate.of(2002, 05, 10));
	Emerson.setSexo('m');
	Emerson.setNivelDeAtividade(0);
	
	
	System.out.println(Emerson.getImc() + Emerson.getStatusImc());
	System.out.println(Emerson.getNcd() );
			System.out.println(Emerson.getNivelDeAtividade());
	}
	
}
