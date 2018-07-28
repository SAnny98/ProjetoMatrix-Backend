package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class CalculadoraSalario {

   public BigDecimal getSalarioLiquido(BigDecimal salarioBruto, BigDecimal pentualImpostoINSS) {

    if(salarioBruto != null){ 
         
        if(salarioBruto<=1.693,72){
          	return (salarioBruto -(salarioBruto*8/100));
	}

	else if((salarioBruto >=R$ 1.693,73) && ( salarioBruto <= R$ 2.822,90){
        	return (salarioBruto - (salarioBruto*9/100));
	}

        else if((salarioBruto >R$ 2.822,91){
        	return (salarioBruto - (salarioBruto*11/100));
	}
	
    }
    else{
          throw new IllegalArgumentException();
    }
}   
   	

   public BigDecimal getValorINSS(BigDecimal salarioBruto) {
		
           if(salarioBruto != null){ 
         
        if(salarioBruto<=1.693,72){
          	return (salarioBruto*8/100);
	}

	else if((salarioBruto >=R$ 1.693,73) && ( salarioBruto <= R$ 2.822,90){
        	return (salarioBruto*9/100);
	}

        else if((salarioBruto >R$ 2.822,91){
        	return (salarioBruto*11/100);
	}
	
    }
    else{
          throw new IllegalArgumentException();
    }
} 



   public BigDecimal getValorPlanoDeSaude(Integer idade) {
    int op;

    System.out.println("Pressione o número correspondente a idade.");
    System.out.println(" MENU ");
    System.out.println(" 1) De 0 a 9 anos");
    System.out.println(" 2) De 10 a 19 anos");
    System.out.println(" 3) De 20 a 29 anos");
    System.out.println(" 4) De 30 a 39 anos");
    System.out.println(" 5) De 40 a 49 anos");
    System.out.println(" 6) De 50 a 59 anos");
    System.out.println(" 7) Acima de 60 anos");
    op = Console.readInt(" Opção:  ");
     
                                              
    if((idade!= null) || (idade>0)){ 	
     switch (opcao) {
	
	case 1:
           return salarioBruto - 75,00;
	   break;

	case 2:
           return salarioBruto-  112,50;
	   break;
        
        case 3:
            return salarioBruto - 168,75;  
	    break;
         
        case 4:
           return salarioBruto - 253,13;
	   break;	
        
        case 5:
           return salarioBruto - 379,69;
	   break;

        case 6:
           return salarioBruto - 569,54
	   break;

	case 7:
           return salarioBruto - 854,30;
	   break;
	
        default:
	    System.out.println("Opção Inválida!");
	    break;
     }	
   }
   else{
          throw new IllegalArgumentException();
}
} 
