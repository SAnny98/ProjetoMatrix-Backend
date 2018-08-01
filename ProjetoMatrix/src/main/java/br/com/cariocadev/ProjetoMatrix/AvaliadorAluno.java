package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class AvaliadorAluno {
    public BigDecimal getMaiorNota(BigDecimal[] notas) {

        BigDecimal maior = BigDecimal.ZERO;
          if (!valida(notas)) {
            for (int i = 0; i < notas.lenght; i++) {
                if (notas[i].compareTo(maior) > 0) {
                    maior = notas[i];
                    return maior;
                }
            }
         }
           throw new IllegalArgumentException();
    }

    public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {

        if (valida(nota1) || valida(nota2) || valida(nota3)) {

            if (nota1 == null || nota2 == null || nota3 == null || nota1.compareTo(BigDecimal.ZERO) < 0
            || nota2.compareTo(BigDecimal.ZERO) < 0 || nota3.compareTo(BigDecimal.ZERO) < 0
            || nota1.compareTo(BigDecimal.TEN) > 0   || nota2.compareTo(BigDecimal.TEN) > 0
            || nota3.compareTo(BigDecimal.TEN) > 0) {

                BigDecimal media = BigDecimal.ZERO;

                media = nota1.add(nota2.add(nota3)).divide(BigDecimal.valueOf(3), 2, BigDecimal.ROUND_HALF_UP);
                return media;
             }

            }
                    throw new IllegalArgumentException();
        }
            
    public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
       
     if(valida(nota1)||valida(nota2)|| valida(nota3)){
        BigDecimal media = getMedia(nota1, nota2, nota3);

        if (media.compareTo(BigDecimal.valueOf(6)) >= 0) {
            return "APROVADO";
        }
        else if (media.compareTo(BigDecimal.valueOf(4)) < 0) {
            return"REPROVADO";
        }
        else{
            return "PROVA_FINAL";
	}
     }

         throw new IllegalArgumentException();
     }

   public boolean valida(BigDecimal nota){
     return (nota != null && nota.compareTo(BigDecimal.TEN)<=0 && nota.compareTo(BigDecimal.ZERO)>0);
   }
