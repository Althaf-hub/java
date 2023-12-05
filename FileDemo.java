import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileDemo {
	    public static void main(String[] args) {
	        char[] data = new char[50];
	        FileReader input = null;
	        FileWriter output = null;
	        try {
	            input = new FileReader("output1.txt");
	            int bytesRead = input.read(data);
	            System.out.println(data);
	            input.close();
	            output = new FileWriter("newinput.txt");
	            output.write(data, 0, bytesRead);
	            output.flush();
	            output.close();

	        } catch (IOException e) {
	        	System.out.println("File not found.");
	            e.printStackTrace();
	        } 
	    }
	}


