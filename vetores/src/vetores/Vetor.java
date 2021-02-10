package vetores;

public class Vetor {

	public static void main(String[] args) {
		
		/*##########*/
	   /*-- NOTAS --*/
	  /*##########*/
		
		double notas[] = {8.5 ,9.3 ,7.2 ,9.7};
		
		notas[2] = 8;
		
		/*######################## 
		/*- Calculo - Media notas -*
		/*######################## 
		 
		
		double nota = 0;
		
	   for(int i = 0; i < notas.length; i++) {
	   		nota += notas[i];
	   }
	   
	   double mediaNotas = nota / notas.length;
	   
	   System.out.println("Média das Notas:" + mediaNotas);
	   
	    #######################
	    -- Fim da Media notas --
	    ######################*/
		
		
		System.out.println("media :" + media(notas));
		
		
		/*######################*/
		/*------ IDADES --------*/
		/*######################*/
		
		double idades[] = {17, 17, 16,
				17, 17, 17, 16,
				17, 22, 17, 19,
				16, 16 , 17, 16, 
				16};
		
		System.out.println("Media das idades:" + soma(idades));
		System.out.println(notas.length);
		
		
		
		/*################################
		/*--- Calculo da Media Idades ---*/  
		/*################################
		 
		  
		int totalIdades = 0;
		
		for(int i = 0; i < idades.length ; i++) {
			totalIdades += idades[i];
		}
		
		
		
		double mediaIdades = totalIdades / idades.length;
		
		System.out.println("média:" + mediaIdades);
		
		
		 ########################*/
	     /*--- fim do calculo ---*/
		/*######################*/
		
		
		/*#################*/
		/* Loping - Exemplo*/
		/*################# 
		 
		String nome ="Emerson";
		int repeticao = 10;
		
		for(int i = 0; i< repeticao; i++) {
			System.out.println(i + "-" + nome);
		}
		
		-------------------------*/
		
		/* Mostrar nomes  */
		
		String[] nomes = {"Ana", "Pedro", "Fabiana", "Luiz"};
		
		for(int i = 0; i < nomes.length; i++) {
		  System.out.println(nomes[i]);
		}
		
		/* Fim do "mostrar nomes"*/
	}
	
	private static double media( double vetor[]) {
		double soma = 0;
	
		for(int i = 0; i < vetor.length; i++) {
			soma+= vetor[i];
		}
		
		return soma / vetor.length;
	}
	
	private static double soma ( double vetor[]) {
		double calculo = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			calculo += vetor[i];
		}
		
		return calculo;
	}

}
