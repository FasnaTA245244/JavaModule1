package singleton;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		
		for(int i=1;i<=10;i++)
		{
		if(con1.hashCode() == con2.hashCode())
		{
			System.out.println("Conection is Singleton");
		}
		else
		{
			System.out.println("Connection is not Singleton");
		}
		}

	}

}
