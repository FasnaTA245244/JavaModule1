package lsp;

public class Square implements shape {
	
	private int side;
	
	

	public Square(int side) {
		super();
		this.side = side;
	}



	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}



	public int getSide() {
		return side;
	}



	public void setSide(int side) {
		this.side = side;
	}

}
