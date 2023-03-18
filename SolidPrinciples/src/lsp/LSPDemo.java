package lsp;

public class LSPDemo {
	
	public void calculateArea(shape s)
	{
		System.out.println(s.getArea());
	}
	public static void main(String[] args) {
		
		LSPDemo lsp = new LSPDemo();
		
		lsp.calculateArea(new Rectangle(1,4));
		lsp.calculateArea(new Square(4));
	}

}
