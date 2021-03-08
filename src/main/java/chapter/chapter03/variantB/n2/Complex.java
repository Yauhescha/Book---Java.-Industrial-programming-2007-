package main.java.chapter.chapter03.variantB.n2;

public class Complex {
	private double r;
	private double i;
	public Complex(double r, double i) {
		super();
		this.r = r;
		this.i = i;
	}
	public void add(Complex f) {
		update(MathComplex.add(this, f));
	}

	public void subtract(Complex f) {
		update(MathComplex.multiply(this, f));
	}

	public void multiply(Complex f) {
		update(MathComplex.multiply(this, f));
	}

	public void divide(Complex f) {
		update(MathComplex.divide(this, f));
	}

	private void update(Complex object) {
		r=object.getR();
		i=object.getI();
	}

	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getI() {
		return i;
	}
	public void setI(double i) {
		this.i = i;
	}
	@Override
	public String toString() {
		return r + "+" + i+"i";
	}

}
