package main.java.chapter.chapter03.variantB.n3;

public class Interval {
	private double a;
	private double b;
	private boolean leftBorder = false;
	private boolean rightBorder = false;

	public Interval(double a, double b, boolean leftBorder, boolean rightBorder) {
		super();
		this.a = a;
		this.b = b;
		this.leftBorder = leftBorder;
		this.rightBorder = rightBorder;
	}

	public Interval(double a, double b, boolean withBorder) {
		super();
		this.a = a;
		this.b = b;
		this.leftBorder = withBorder;
		this.rightBorder = withBorder;
	}

	@Override
	public String toString() {
		String strLeft = leftBorder ? "[" : "(";
		String strRight = rightBorder ? "]" : ")";
		return strLeft + a + "; " + b + strRight;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public boolean isLeftBorder() {
		return leftBorder;
	}

	public void setLeftBorder(boolean leftBorder) {
		this.leftBorder = leftBorder;
	}

	public boolean isRightBorder() {
		return rightBorder;
	}

	public void setRightBorder(boolean rightBorder) {
		this.rightBorder = rightBorder;
	}

}
