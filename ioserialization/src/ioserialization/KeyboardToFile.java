package ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFile {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Entered Main...");
		String data = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		FileWriter writer = new FileWriter("Nammadefile.txt");
		
		System.out.println("Enter some text ");
		data = reader.readLine();
			while(!data.equals("quit"))
		{
				//System.out.println("You have entered...."+ data);
				writer.write(data);
		data = reader.readLine();
		}
			writer.flush();
			writer.close();
			reader.close();
		System.out.println("Main Exited...");
	}

}
