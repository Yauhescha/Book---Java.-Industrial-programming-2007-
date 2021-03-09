package main.java.chapter.chapter03.variantB.n4;

public class Polynominal  implements Cloneable{
	private double[] coefficients;

	public Polynominal(double ... coefficients) {
		super();
		this.coefficients = coefficients;
	}
	
	public Polynominal(int dimension) {
		super();
		coefficients = new double[dimension];
	}

	public double[] getCoefficients() {
		return coefficients;
	}
	public double getCoefficient(int index) {
		return coefficients[index];
	}

	public void setCoefficients(double ... coefficients) {
		this.coefficients = coefficients;
	}
	
	public int getDimension() {
		return coefficients.length;
	}

	@Override
	public String toString() {
		String str=coefficients[0]==0?"":coefficients[0]+"";
		for(int i=1; i< coefficients.length;i++) {
			if(coefficients[i]!=0)
			str+=" + "+coefficients[i]+"*x^"+i;
		}
		return str;
	}
	
	
}
