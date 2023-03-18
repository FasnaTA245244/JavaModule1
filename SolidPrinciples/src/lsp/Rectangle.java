package lsp;

public class Rectangle implements shape {
	
	private int length;
	private int breadth;
	
	

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}



	


	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}



	public int getBreadth() {
		return breadth;
	}



	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return this.length*this.breadth;
	}


}
