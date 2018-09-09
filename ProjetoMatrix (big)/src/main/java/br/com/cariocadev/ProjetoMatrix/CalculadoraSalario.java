package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraSalario {

	public BigDecimal getSalarioLiquido(BigDecimal salarioBruto, BigDecimal salarioLiquido) {

		if (salarioBruto != null) {

			if (salarioBruto.compareTo(BigDecimal.valueOf(1693.72)) <= 0)
				return salarioLiquido = ((salarioBruto.subtract(salarioBruto.multiply(BigDecimal.valueOf(0.08))))
						.setScale(2, RoundingMode.HALF_UP));

			else if (salarioBruto.compareTo(BigDecimal.valueOf(2822.90)) <= 0)
				return salarioLiquido = ((salarioBruto.subtract(salarioBruto.multiply(BigDecimal.valueOf(0.09))))
						.setScale(2, RoundingMode.HALF_UP));

			else if (salarioBruto.compareTo(BigDecimal.valueOf(2822.91)) >= 0)
				return salarioLiquido = ((salarioBruto.subtract(salarioBruto.multiply(BigDecimal.valueOf(0.11))))
						.setScale(2, RoundingMode.HALF_UP));
		}
		throw new IllegalArgumentException();
	}

	public BigDecimal getValorINSS(BigDecimal salarioBruto) {

		if (salarioBruto != null) {

			if (salarioBruto.compareTo(BigDecimal.valueOf(1693.72)) <= 0)
				return ((salarioBruto.multiply(BigDecimal.valueOf(0.08))).setScale(2, RoundingMode.HALF_UP));

			else if (salarioBruto.compareTo(BigDecimal.valueOf(2822.90)) <= 0)
				return ((salarioBruto.multiply(BigDecimal.valueOf(0.09))).setScale(2, RoundingMode.HALF_UP));

			else if (salarioBruto.compareTo(BigDecimal.valueOf(2822.91)) >= 0)
				return ((salarioBruto.multiply(BigDecimal.valueOf(0.11))).setScale(2, RoundingMode.HALF_UP));
		}

		throw new IllegalArgumentException();
	}

	public BigDecimal getValorPlanoDeSaude(Integer idade) {

		if (idade != null && idade > 0) {

			if (idade >= 0 && idade <= 9)
				return BigDecimal.valueOf(75.00).setScale(2, RoundingMode.HALF_UP);

			else if (idade >= 10 && idade <= 19)
				return BigDecimal.valueOf(112.50).setScale(2, RoundingMode.HALF_UP);

			else if (idade >= 20 && idade <= 29)
				return BigDecimal.valueOf(168.75).setScale(2, RoundingMode.HALF_UP);

			else if (idade >= 30 && idade <= 39)
				return BigDecimal.valueOf(253.13).setScale(2, RoundingMode.HALF_UP);

			else if (idade >= 40 && idade <= 49)
				return BigDecimal.valueOf(379.69).setScale(2, RoundingMode.HALF_UP);

			else if (idade >= 50 && idade <= 59)
				return BigDecimal.valueOf(569.54).setScale(2, RoundingMode.HALF_UP);

			else if (idade >= 60)
				return BigDecimal.valueOf(854.30).setScale(2, RoundingMode.HALF_UP);
		}
		throw new IllegalArgumentException();
	}
}