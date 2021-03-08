package main.java.chapter.chapter03.variantB.n3;

public class SolveVariant {
	AnswerType type;
	double[] roots;

	public SolveVariant(AnswerType type, double[] roots) {
		super();
		this.type = type;
		this.roots = roots;
	}

	@Override
	public String toString() {
		String str = type + ": ";
		for (double r : roots)
			str += r + "; ";
		return str;
	}

}
