package br.senai.sp.jandira.moldel;

import java.time.LocalDate;
import java.time.Period;

import br.senai.sp.jandira.Aluno;

public class idade {

	public static void main(String[] args) {
		
		
	LocalDate dataNascimento = LocalDate.of(2004, 7, 14);
	LocalDate hoje = LocalDate.now();
	
	Period idade = Period.between(dataNascimento, hoje);
	

	}

}
