package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;



public class AvaliadorAluno {


public BigDecimal getMaiorNota(BigDecimal[] notas) {
	  
int i;
BigDecimal media = new BigDecimal ();
  
  for (i=0; i<notas.lenght; i++) {
     
     if(notas[i]== null){
      
       throw new IllegalArgumentException();
     }

     else if(maior<notas[i]){
          maior=notas[i];
          return maior;
     }
    	   
   }
}


public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {


BigDecimal media = new BigDecimal();

 if((nota1 ==null ) && (nota2 ==null ) && (nota3 ==null )){

        if(((nota1<10 ) && (nota2 <10 ) && (nota3<10 )) && ((nota1>0) && (nota2>0) && (nota3>0 ) ){
                media = ((nota 1 + nota 2 + nota 3)/3);
		return media;
         }
        else {
               throw new IllegalArgumentException();
        }
 }

else {
              throw new IllegalArgumentException();
        }




public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {

BigDecimal media = new BigDecimal();

if if((nota1 ==null ) && (nota2 ==null ) && (nota3 ==null ){

 if(((nota1<10 ) && (nota2 <10 ) && (nota3<10 )) && ((nota1>0) && (nota2>0) && (nota3>0 ) ){
                media = ((nota 1 + nota 2 + nota 3)/3);
		return media;
         }
        else {
               throw new IllegalArgumentException();
        }
 }

else {
               throw new IllegalArgumentException();
        }

	if(media>=6){
        	System.out.println("APROVADO");	
	}
	else if(media<4){
		System.out.println("REPROVADO");	
	}
	else if((media>=4) && (media<6)){
		System.out.println("PROVA_FINAL");	
	}
}
	


