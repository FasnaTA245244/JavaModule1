package oopsday3.atm.exception;

public class InsufficientFundsException extends Exception 
{
	public InsufficientFundsException()
	{
		
	}

	public InsufficientFundsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
	
	

}
