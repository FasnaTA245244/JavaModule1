package readJson;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class TestJson {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		JSONObject employeeDetails = new JSONObject();
		employeeDetails.put("firstName" , "Anil");
		employeeDetails.put("lastName" , "Bhoppuri");
		employeeDetails.put("website", "java.point.io");
		
		
		JSONObject employeeObject = new JSONObject(); 
        employeeObject.put("employee", employeeDetails);
         
        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Brian");
        employeeDetails2.put("lastName", "Schultz");
        employeeDetails2.put("website", "example.com");
         
        JSONObject employeeObject2 = new JSONObject(); 
        employeeObject2.put("employee", employeeDetails2);
         
        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        
        
        //Write JSON file
        try(FileWriter file = new FileWriter("employees.json"))    //try with resource (new construct in java 7)
        {
        	//we can write any JSONArray 
        	file.write(employeeList.toJSONString());
        	file.flush();
        }
        catch(IOException e) 
        {
        	e.printStackTrace();
        }
        
        		
       


	}

}
