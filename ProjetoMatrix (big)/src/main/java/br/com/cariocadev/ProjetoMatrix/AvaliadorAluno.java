package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AvaliadorAluno {

	public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {

		BigDecimal media = getMedia(nota1, nota2, nota3);

		if (media != null && validaNota(nota1, nota2, nota3)) {
			if (media.compareTo(BigDecimal.valueOf(6.0)) >= 0)
				return "APROVADO";

			else if (media.compareTo(BigDecimal.valueOf(4.0)) <= 0)
				return "REPROVADO";

			else if ((media.compareTo(BigDecimal.valueOf(4.0)) >= 0) && (media.compareTo(BigDecimal.valueOf(6.0)) <= 0))

				return "PROVA_FINAL";
		}
		throw new IllegalArgumentException();

	}

	public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {

		if (validaNota(nota1, nota2, nota3)) {

			BigDecimal média = new BigDecimal(0);
			média = ((nota3.add(nota2.add(nota1))).divide(BigDecimal.valueOf(3.0), 2, RoundingMode.HALF_UP));
			return média;
		}
		throw new IllegalArgumentException();
	}

	public BigDecimal getMaiorNota(BigDecimal notas[]) {

		if (notas != null) {

			int MaiorNota = 0;

			for (int i = 1; i <= notas.length; i++) {
				if (notas[i].compareTo(notas[MaiorNota]) == 1)
					MaiorNota = i;
			}
			return (notas[MaiorNota].setScale(2, RoundingMode.HALF_UP));
		}
		throw new IllegalArgumentException();
	}

	public Boolean validaNota(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		return (nota1 != null && nota1.compareTo(BigDecimal.valueOf(0)) >= 0
				&& nota1.compareTo(BigDecimal.valueOf(10)) <= 0 && nota2 != null
				&& nota2.compareTo(BigDecimal.valueOf(0)) >= 0 && nota2.compareTo(BigDecimal.valueOf(10)) <= 0
				&& nota3 != null && nota3.compareTo(BigDecimal.valueOf(0)) >= 0
				&& nota3.compareTo(BigDecimal.valueOf(10)) <= 0);
	}

}
