package br.senai.sp.jandira;

import java.time.Period;
import java.time.LocalDate;

public class Aluno {
	private String nome;
	private double peso;
	private double altura;
	private char genero;
	private LocalDate dataNascimento;
	private int periodo;
	
	
	/*Set e Get - Nome*/
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getnome() {
		return this.nome;
	}
	
	/*Set e Get - Peso */
	
	public void setpeso(double peso) {
		this.peso = peso;
	}
	
	public double getpeso() {
		return this.peso;
	}
	
	/*Set e Get - Altura*/
	
	public void setaltura(double altura) {
		this.altura = altura;
	}
	
	public double getaltura() {
		return this.altura;
	}
	
	/*Set e Get - G�nero*/
	
	public void setgenero(char genero) {
		this.genero = genero;
	}
	
	public char getgenero() {
		return this.genero;
	}
	
	/* Get LocalDate*/
	
	public LocalDate dataNascimento() {
		LocalDate dataNascimento = LocalDate.of(2004, 7, 14); 
		
		return dataNascimento;
	}
	
	/*Set e Get Idade*/
	
	public void setperiodo(int periodo) {
		this.periodo = periodo;
	}
	
	public int getperiodo() {
		
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(dataNascimento, hoje);
		
		return periodo.getYears() ;
	}
	
	
	/*#######*/
	/*Metodos*/ /*Arrumar Metodos ;-;*/
	/*#######*/
	
	public double getImc() {
		return Math.pow(peso, altura);
	}
	
	/*
	public double getNcd() {
		return ;
	}
	*/
	
	
	public String getStatusImc(){
		
		
		if(this.getImc()<18.5){
			return("Abaixo do peso");
		}else {
			
		}
	    if(this.getImc()>18.5 && this.getImc()<25){
			return ("Peso ideal - (parab�ns");
		}else {
			
		}
	    if (this.getImc()>25 && this.getImc()<30) {
	    	return ("Levemente acima do peso");
	    }else {
	    	
	    }
		if(this.getImc()>30 && this.getImc()<35) {
			return ("Obesidade I");
		}else {
		
		}
		if(this.getImc()>35 && this.getImc()<40) {
			return ("Obesidade II - (Severa)");
		}else {
			
		}
		if(this.getImc()>40) {
			return ("Obesidade III - (M�rbida)");
		}else {
			
		}
		return nome;
		
	}

	
}
