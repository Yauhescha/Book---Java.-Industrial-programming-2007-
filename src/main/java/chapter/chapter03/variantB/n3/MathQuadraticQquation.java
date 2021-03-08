package main.java.chapter.chapter03.variantB.n3;

import java.util.ArrayList;

public class MathQuadraticQquation {

	public static SolveVariant getRoots(QuadraticEquation o) {
		SolveVariant sv;
		double d = Math.pow(o.getB(), 2) - 4 * o.getA() * o.getC();
		if (d <= 0)
			sv = new SolveVariant(AnswerType.WithoutAnswer, new double[] {});
		else if (d == 0) {

			sv = new SolveVariant(AnswerType.OneRoot, new double[] { -o.getB() / 2 * o.getA() });
		} else {
			double[] answer = new double[2];
			answer[0] = (-o.getB() + Math.sqrt(d)) / 2 * o.getA();
			answer[1] = (-o.getB() - Math.sqrt(d)) / 2 * o.getA();
			sv = new SolveVariant(AnswerType.TwoRoots, answer);
		}
		return sv;
	}
	public static double[] getExtremes(QuadraticEquation o,  double intervalFrom, double intervalTo) {
		double[] answer = new double[2];
		answer[0]=getMinimum(o, intervalFrom, intervalTo);
		answer[0]=getMaximum(o, intervalFrom, intervalTo);
		return answer;
	}
	private static double getMaximum(QuadraticEquation o, double intervalFrom, double intervalTo) {
		double max=solve(o,intervalFrom);
		double temp;
		for(double i=intervalFrom; i<=intervalTo; i+=0.1) {
			temp=solve(o, i);
			max=max>temp?max:temp;
		}
		return max;
	}
	private static double getMinimum(QuadraticEquation o, double intervalFrom, double intervalTo) {
		double min=solve(o,intervalFrom);
		double temp;
		for(double i=intervalFrom; i<=intervalTo; i+=0.1) {
			temp=solve(o, i);
			min=min<temp?min:temp;
		}
		return min;
	}
	private static double solve(QuadraticEquation o, double x) {
		return o.getA()*Math.pow(x,2)+o.getB()*x+o.getC();
	}
	
	public static ArrayList<Interval> getRisingIntervals(QuadraticEquation o, double intervalFrom, double intervalTo) {
		ArrayList<Interval> list = new ArrayList<Interval>();
		double before=solve(o, intervalFrom);
		double now;
		Interval interval=null;
		for(double i=intervalFrom+0.1; i<=intervalTo; i+=0.1) {
			now=solve(o, i);
			if(now>before && interval==null)
				interval=new Interval(before, now, true);
			else if(now<before && interval!=null) {
				interval.setB(before);
				list.add(interval);
				interval=null;
			}
		}
		return list;
	}
	public static ArrayList<Interval> getFallingIntervals(QuadraticEquation o, double intervalFrom, double intervalTo) {
		ArrayList<Interval> list = new ArrayList<Interval>();
		double before=solve(o, intervalFrom);
		double now;
		Interval interval=null;
		for(double i=intervalFrom+0.1; i<=intervalTo; i+=0.1) {
			now=solve(o, i);
			if(now<before && interval==null)
				interval=new Interval(before, now, true);
			else if(now>before && interval!=null) {
				interval.setB(before);
				list.add(interval);
				interval=null;
			}
		}
		return list;
	}
}