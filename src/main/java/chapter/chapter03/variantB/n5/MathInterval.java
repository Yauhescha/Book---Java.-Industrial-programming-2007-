package main.java.chapter.chapter03.variantB.n5;

public class MathInterval {

	public static Interval union(Interval o1, Interval o2, double step) {
		if(!isIntersection(o1, o2)) return null;
		
		return null;
	}
	
	public static Interval intersection(Interval o1, Interval o2, double step) {
		if(!isIntersection(o1, o2)) return null;
		Double start=null, stop=null;
		double dStart, dEnd;
		dStart=o1.isLeftBorder()?o1.getStart():o1.getStart()+step;
		dEnd=o1.isRightBorder()?o1.getEnd():o1.getEnd()-step;
		
		double d2Start, d2End;
		d2Start=o2.isLeftBorder()?o2.getStart():o2.getStart()+step;
		d2End=o2.isRightBorder()?o2.getEnd():o2.getEnd()-step;

		for(double i=dStart;i<=dEnd;i+=step) {
			if(	i>=d2Start && i<=d2End) {
				if(start==null)
					start=i;
				stop=i;
			}
		}
		return new Interval(start.doubleValue(), stop.doubleValue(), true);
	}
	
	public static boolean isIntersection(Interval o1, Interval o2) {
		boolean intersectStart, intersectEnd;
		if(o1.isLeftBorder() && o2.isRightBorder())
			intersectStart = o1.getStart()<=o2.getEnd();
		else 
			intersectStart = o1.getStart()<o2.getEnd();
		
		if(o1.isRightBorder() && o2.isLeftBorder())
			intersectEnd=o1.getEnd()>=o2.getStart();
		else
			intersectEnd=o1.getEnd()>o2.getStart();
		
			return intersectStart && intersectEnd;
	}
	
}
