package main.java.chapter.chapter03.variantB.n1;

public class MathFraction {

	public static Fraction add(Fraction f1, Fraction f2) {
		Fraction f;
		if(f1.getN()==f2.getN()) {
			f=new Fraction(f1.getM()+f2.getM(), f1.getN());
		}
		else {
			double commonM=f1.getM()*f2.getN()+f2.getM()*f1.getN();
			double commonN=f1.getN()*f2.getN();
			f=new Fraction(commonM, commonN);
			cutBack(f);
		}
		return f;
	}

	public static Fraction subtract(Fraction f1, Fraction f2) {
		Fraction f;
		if(f1.getN()==f2.getN()) {
			f=new Fraction(f1.getM()-f2.getM(), f1.getN());
		}
		else {
			double commonM=f1.getM()*f2.getN()-f2.getM()*f1.getN();
			double commonN=f1.getN()*f2.getN();
			f=new Fraction(commonM, commonN);
			cutBack(f);
		}
		return f;
	}

	public static Fraction multiply(Fraction f1, Fraction f2) {
		Fraction f;
		double commonM=f1.getM()*f2.getM();
		double commonN=f1.getN()*f2.getN();
		f=new Fraction(commonM, commonN);
		cutBack(f);
		return f;
	}

	public static Fraction divide(Fraction f1, Fraction f2) {
		return multiply(f1, new Fraction(f2.getN(), f2.getM()));
	}

	public static void cutBack(Fraction f) {
		boolean again=true;
		int maxStep=20;
		while(again) {
			again=false;
			for(int i=2;i<maxStep;i++) {
				if(f.getM()%i==0 && f.getN()%i==0) {
					f.setM(f.getM()/i);
					f.setN(f.getN()/i);
					again=true;
				}
			}
		}
		
	}
}
