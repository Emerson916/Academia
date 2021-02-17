package br.senai.sp.jandira.moldel.gui;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {
	private String nome;
	private char sexo;
    private LocalDate dataDeNascimento;
	private int nivelDeAtividade;
	private double peso;
	private double altura;
	
	
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
	
	/* Set e Get - NOME */ 
	
	public void setNome(String nome) {
		this.nome = nome ;
	}
	
	public String getnome() {
		return this.nome;
	}
	
	/* Set e Get - Sexo*/
	
	public void setSexo(char sexo) {
		if (sexo == 'm') {
			this.sexo = 'm';
		}else {
			if(sexo == 'f') {
				this.sexo = 'f';
			}else {
				
			}
		}
	}
	
	public char getsexo() {
		return this.sexo;
	}
	
	/*Set e Get - Data de nascimento */
	
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
		
	}
	
	public LocalDate getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	
	public int getidade() {
	
	LocalDate hoje = LocalDate.now();	
		
	Period idade = Period.between(this.dataDeNascimento, hoje);
	
	return idade.getYears();
	
	}
	/* Set e Get - Nivel De Atividade */
	
	public void setNivelDeAtividade(int nivelDeAtividade) {
		
		if(nivelDeAtividade == 0){
			 this.nivelDeAtividade = 0;
		}else if(nivelDeAtividade == 1) {
			 this.nivelDeAtividade = 1;
		}else if(nivelDeAtividade == 2) {
			this.nivelDeAtividade = 2;
		}else if (nivelDeAtividade == 3) {
			this.nivelDeAtividade = 3;
		}
		
			}
	
	public int getNivelDeAtividade() {
		return this.nivelDeAtividade;
	}

	/*#######*/
	/*Metodos*/ 
	/*#######*/
	
	
	
	public double getImc() {
		return this.peso / Math.pow (altura, 2);
	}
	
	
	public String getStatusImc(){
		
		
		if(this.getImc()<18.5){
			return("Abaixo do peso");
		}else {
			
		}
	    if(this.getImc()>18.5 && this.getImc()<25){
			return ("Peso ideal - parabéns");
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
			return ("Obesidade III - (Mórbida)");
		}else {
			return "ERRO!!";
		}
		
	}
	
	/* NCD -  inicio*/
	
	/* m = Masculino */
	
	/* f = Feminino */
	
	public double getNcd() {
		if(this.sexo == 'm' ){
			
			/*conta sem atividade */
			
			if(this.nivelDeAtividade == 0) {
				/* Idade */
				if(getidade()>=18 && getidade() <=30) {
					return  15.3 * this.peso + 679; 
				}else if(getidade()>=31 && getidade() <=60) { /*nenhum*/
						return  11.6 * this.peso + 879;  
				
					}else if(getidade()>=60) {
						return 13.5 * peso + 487;  
					}else {
						return 0;
					}
			}else if(this.nivelDeAtividade == 1){
				if(getidade()>=18 && getidade() <=30) {
					return  (15.3 * this.peso + 679) * 1.5;
				}else if(getidade()>=31 && getidade() <=60) { /*nivel leve*/
					return  (11.6 * this.peso + 879) * 1.5;  
					
				}else if(getidade()>=60) {
					return (13.5 * peso + 487) * 1.5;  
				}else {
					return 0;
				}
				
			}else if(this.nivelDeAtividade == 2) {
				if(getidade()>=18 && getidade() <=30) {
					return  (15.3 * this.peso + 679) * 1.8;
				}else if(getidade()>=31 && getidade() <=60) { /*nivel moderado*/
					return  (11.6 * this.peso + 879) * 1.8;  
					
				}else if(getidade()>=60) {
					return (13.5 * peso + 487) * 1.8;  
				}else {
					return 0;
				}
			
			}if(getidade()>=18 && getidade() <=30) {
				return  (15.3 * this.peso + 679) * 2.1;
			}else if(getidade()>=31 && getidade() <=60) { /*nivel intenso*/
				return  (11.6 * this.peso + 879) * 2.1;  
				
			}else if(getidade()>=60) {
				return (13.5 * peso + 487) * 2.1;  
			}else {
				return 0;
		}
			/*#########################*/
			/*#### Feminino - NCD #####*/
			/*#########################*/
			
		}else if(this.sexo == 'f') {
				/*conta sem atividade */
			
			if(this.nivelDeAtividade == 0) {
				/* Idade */
				if(getidade()>=18 && getidade() <=30) {
					return  14.7 * this.peso + 493; 
				}else if(getidade()>=31 && getidade() <=60) { /*nenhum*/
						return  8.7 * this.peso + 829;  
				
					}else if(getidade()>=60) {
						return 10.5 * peso + 596;  
					}else {
						return 0;
					}
			}else if(this.nivelDeAtividade == 1){
				if(getidade()>=18 && getidade() <=30) {
					return  (14.7 * this.peso + 493) * 1.6;
				}else if(getidade()>=31 && getidade() <=60) { /*nivel leve*/
					return  (8.7 * this.peso + 829) * 1.6;  
					
				}else if(getidade()>=60) {
					return (10.5 * peso + 596) * 1.6;  
				}else {
					return 0;
				}
				
			}else if(this.nivelDeAtividade == 2) {
				if(getidade()>=18 && getidade() <=30) {
					return  (14.7 * this.peso + 493) * 1.6;
				}else if(getidade()>=31 && getidade() <=60) { /*nivel moderado*/
					return  (8.7 * this.peso + 829) * 1.6;  
					
				}else if(getidade()>=60) {
					return (10.5 * peso + 596) * 1.6;  
				}else {
					return 0;
				}
			
			}if(getidade()>=18 && getidade() <=30) {
				return  (14.7 * this.peso + 493) * 1.8;
			}else if(getidade()>=31 && getidade() <=60) { /*nivel intenso*/
				return  (8.7 * this.peso + 829) * 1.8;  
				
			}else if(getidade()>=60) {
				return (10.5 * peso + 596) * 1.8;  
			}else {
				return 0;
		}
		}else {
			return 0;
		}
	}
}
