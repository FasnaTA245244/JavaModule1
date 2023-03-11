package oopsday2shape;

public class Rec implements ShapeIRec {
	
	private double length;
	private double breadth;
	
	public Rec() {
		
	}
	
	public Rec(double length,double breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public void Area() {
		if(length>0 && breadth>0)
		{
			System.out.println("Area =" + length*breadth);
		}
		

	}

	@Override
	public String toString() {
		return "Rec [length=" + length + ", breadth=" + breadth + "]";
	}
	

}
