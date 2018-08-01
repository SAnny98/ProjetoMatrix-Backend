
package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class CalculadoraSalario {
 
  public boolean valida(BigDecimal nota){
    return (nota != null && nota.compareTo(BigDecimal.TEN)<=0 && nota.compareTo(BigDecimal.ZERO)>0);
  }

  public BigDecimal getSalarioLiquido(BigDecimal salarioBruto, BigDecimal pentualImpostoINSS) {
    
    if(valida(salarioBruto)){ 
      
      if(salarioBruto.compareTo(BigDecimal.valueOf(1693.72)<=0){
      	return salarioBruto.subtract(salarioBruto.multiply(BigDecimal.valueOf(0.08))).setScale(2, BigDecimal.ROUND_HALF_UP);
      }

       else if(salarioBruto.compareTo(BigDecimal.valueOf(1693.72))>0 && salarioBruto.compareTo(BigDecimal.valueOf(2822.90)<=0){
         return  salarioBruto.subtract(salarioBruto.multiply(BigDecimal.valueOf(0.09))).seScale(2, BigDecimal.ROUND_HALF_UP);
       }
    
       else {
         return salarioBruto.subtract(salarioBruto.multiply(BigDecimal.valueOf(0.11))).setScale(2, BigDecimal.ROUND_HALF_UP));
      }
    }
       throw new IllegalArgumentException();
}   

   public BigDecimal getValorINSS(BigDecimal salarioBruto) {
     
       if(valida(salarioBruto)){ 
      
       if(salarioBruto.compareTo(BigDecimal.valueOf(1693.72))<=0){

           return salarioBruto.multiply(BigDecimal.valueOf(0.08));
       }
	  
       else if(salarioBruto.compareTo(BigDecimal.valueOf(1693.72)) >0 && salarioBruto.compareTo(BigDecimal.valueOf(2822.90))<=0){
          return (salarioBruto.multiply(BigDecimal.valueOf(0.09)));
       }
    
       else {
         return (salarioBruto.multiply(BigDecimal.valueOf(0.11));
       }
    }
       throw new IllegalArgumentException();
}   


  public BigDecimal getValorPlanoDeSaude(Integer idade) {
          
   if(idade!= null && idade>=0){
                                              
      if(idade>=0 && idade<=9){
	 return BigDecimal.valueOf(75).setScale(2, BigDecimal.ROUND_HALF_UP));
      }
      else if(idade >=10 && idade<=19){
          return BigDecimal.valueOf(112.50).setScale(2, BigDecimal.ROUND_HALF_UP));
      }
      else if(idade>=20 && idade<=29){
	 return BigDecimal.valueOf(168.75).setScale(2, BigDecimal.ROUND_HALF_UP));
      }
      else if(idade>=30 && idade<=39){
	 return BigDecimal.valueOf(253.13).setScale(2, BigDecimal.ROUND_HALF_UP));
      }    
      else if(idade>=40 && idade<=49){
	 return BigDecimal.valueOf(379.69).setScale(2, BigDecimal.ROUND_HALF_UP));
      } 
      else if(idade>=50 && idade<=59){
	 return BigDecimal.valueOf(569.54).setScale(2, BigDecimal.ROUND_HALF_UP));
      } 
      else if(idade>=60){
         return BigDecimal.valueOf(854.30).setScale(2, BigDecimal.ROUND_HALF_UP));
      }	
   }
          throw new IllegalArgumentException();
   }
