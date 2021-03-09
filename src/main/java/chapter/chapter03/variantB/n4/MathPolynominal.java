package main.java.chapter.chapter03.variantB.n4;

import java.util.ArrayList;

public class MathPolynominal {

	public static Polynominal add(final Polynominal o1, final Polynominal o2) {
		Polynominal f;
		double[] coeff;
		if (o1.getDimension() > o2.getDimension()) {
			coeff = o1.getCoefficients().clone();
			for (int i = 0; i < o2.getDimension(); i++)
				coeff[i] += o2.getCoefficient(i);
		} else {
			coeff = o2.getCoefficients().clone();
			for (int i = 0; i < o1.getDimension(); i++)
				coeff[i] += o1.getCoefficient(i);
		}
		f = new Polynominal(coeff);
		cutBack(f);
		return f;
	}

	public static Polynominal subtract(final Polynominal o1, final Polynominal o2) {
		Polynominal f;
		double[] coeff;
		if (o1.getDimension() > o2.getDimension()) {
			coeff = o1.getCoefficients().clone();
			for (int i = 0; i < o2.getDimension(); i++)
				coeff[i] -= o2.getCoefficient(i);
		} else {
			coeff = o1.getCoefficients().clone();
			for (int i = 0; i < o1.getDimension(); i++)
				coeff[i] -= o2.getCoefficient(i);
			Polynominal multiply = multiply(new Polynominal(-1d), o2);
			double[] coeffBefore = multiply.getCoefficients();
			for (int i = 0; i < coeff.length; i++)
				coeffBefore[i] = coeff[i];
			coeff = coeffBefore;
		}
		f = new Polynominal(coeff);
		cutBack(f);
		return f;
	}

	public static Polynominal multiply(final Polynominal o1, final Polynominal o2) {
		Polynominal f;
		double[] coeff = new double[o1.getDimension() + o2.getDimension() - 1];
		for (int i = 0; i < o1.getDimension(); i++) {
			for (int j = 0; j < o2.getDimension(); j++) {
				coeff[i + j] += o1.getCoefficient(i) * o2.getCoefficient(j);
			}
		}

		f = new Polynominal(coeff);
		cutBack(f);
		return f;
	}

	public static Polynominal[] divide(final Polynominal o1, final Polynominal o2) {
		// частное
		ArrayList<Polynominal> quotient = new ArrayList<Polynominal>();
		// остаток
		Polynominal remainder = new Polynominal(o1.getCoefficients());
		// промежуточное
		Polynominal temp;

		if (o1.getDimension() < o2.getDimension()) {
			System.out.println("Невозможно поделить полином меньшей степени на полином большей степени");
			return null;
		}

		int maxSolve = 5;
		while (o2.getDimension() <= remainder.getDimension() && maxSolve != 0) {
			maxSolve--;
			// создаем частное с коэфициентом, чтоб сравнять размерности
			quotient.add(new Polynominal(remainder.getDimension() - o2.getDimension() + 1));
			// для быстрогодоступа к частному
			int quotientIndex = quotient.size() - 1;

			// заноcим значение этого коэфициента. он равен последнее значение остатка /
			// текущее значение
			quotient.get(quotientIndex).getCoefficients()[quotient.get(quotientIndex).getDimension() - 1] = remainder
					.getCoefficient(remainder.getDimension() - 1) / o2.getCoefficient(o2.getDimension() - 1);
			// уравниваем размерности и получаем уравнение равное делителю умноженному на
			// коэфициент
			temp = multiply(quotient.get(quotientIndex), o2);

			// высчитываем остаток от деления
			remainder = subtract(remainder, temp);
		}
		// после деления объединяем коэфициент в одно уравнение
		temp = new Polynominal();
		for (Polynominal p : quotient)
			temp = add(temp, p);
		// возвращаем сперва коэфициент, а затем остаток
		return new Polynominal[] { temp, remainder };
	}

	private static void cutBack(Polynominal o) {
		double[] coeff = o.getCoefficients();
		int dimension = o.getDimension();
		for (int i = dimension - 1; i >= 0; i--) {
			if (o.getCoefficient(i) != 0) {
				coeff = new double[i + 1];
				for (int j = 0; j <= i; j++) {
					coeff[j] = o.getCoefficients()[j];
				}
				break;
			}
		}
		o.setCoefficients(coeff);
	}
}
