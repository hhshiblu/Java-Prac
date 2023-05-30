import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class Create {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
    
    } 
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}