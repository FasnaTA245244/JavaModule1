package oopsday4.composition;

public class B extends A {
	
	public B()
	{
		//super(;)
		// not allowed ->System.out.println("From B());
		super(10,20); //for constructor chain
		//System.out.println(x+y);
	}

}
