package main.java.chapter.chapter03.variantB.n1;

public class Fraction {
	private double m;
	private double n;

	public Fraction(double m, double n) {
		super();
		this.m = m;
		if (n == 0)
			throw new NumberFormatException("Знаменатель не может быть равен нулю");
		this.n = n;
	}

	public void add(Fraction f) {
		update(MathFraction.add(this, f));
	}

	public void subtract(Fraction f) {
		update(MathFraction.multiply(this, f));
	}

	public void multiply(Fraction f) {
		update(MathFraction.multiply(this, f));
	}

	public void divide(Fraction f) {
		update(MathFraction.divide(this, f));
	}

	public void cutBack(Fraction f) {
		MathFraction.cutBack(f);
	}

	private void update(Fraction f) {
		m = f.getM();
		n = f.getN();
	}

	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return m + "/" + n;
	}

}
