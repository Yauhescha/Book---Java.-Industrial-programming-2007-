package main.java.chapter.chapter03.variantB.n2;

public class MathComplex {

	public static Complex add(Complex o1, Complex o2) {
		Complex f;
		f = new Complex(o1.getR() + o2.getR(), o1.getI() + o2.getI());
		return f;
	}

	public static Complex subtract(Complex o1, Complex o2) {
		Complex f;
		f = new Complex(o1.getR() - o2.getR(), o1.getI() - o2.getI());
		return f;
	}

	public static Complex multiply(Complex o1, Complex o2) {
		Complex f;
		double commonR = o1.getR() * o2.getR() - o1.getI() * o2.getI();
		double commonI = o1.getR() * o2.getI() + o1.getI() * o2.getR();
		f = new Complex(commonR, commonI);
		return f;
	}

	public static Complex divide(Complex o1, Complex o2) {
		Complex f;
		double commonR = (o1.getR() * o2.getR() + o1.getI() * o2.getI())
				/ (Math.pow(o2.getR(), 2) + Math.pow(o2.getI(), 2));
		double commonI = (o1.getI() * o2.getR() - o1.getR() * o2.getI())
				/ (Math.pow(o2.getR(), 2) + Math.pow(o2.getI(), 2));
		f = new Complex(commonR, commonI);
		return f;
	}

}
