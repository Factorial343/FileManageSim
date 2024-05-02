package Dir1;
import java.util.*;
import java.io.*;

public class mainf {

	public static void main(String[] args) throws IOException {
		// TODO import java.io.*;
		 // Display home screen
        System.out.println("Welcome to Java Console Commands!");
        System.out.println("You can use one of the following commands:");
        System.out.println("- touch");
        System.out.println("- mkdir");
        System.out.println("- rm");
        System.out.println("- mv");
        System.out.println("- cp");
        System.out.println("- cp -r");
        System.out.println("- ls");
        System.out.println("- pwd");
        System.out.println("- renamef");
        System.out.println("- size");
        System.out.println("- cat");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine().trim().toLowerCase(); // Read u
        
        System.out.println("Enter the command you want to use:");

        // Create Scanner object to read user input
       // Scanner scanner = new Scanner(System.in);
        //String command = scanner.nextLine().trim().toLowerCase(); // Read user input and trim whitespace

        // Check which command was entered and display appropriate message
      if (command.equals("touch")) {
          System.out.println("You have selected the 'touch' command.");
          CreateFilDir new1 = new CreateFilDir();
		  new1.mkfil();
      } else if (command.equals("mkdir")) {
          System.out.println("You have selected the 'mkdir' command.");
          CreateFilDir new2 = new CreateFilDir();
          new2.mkdir();
      } else if (command.equals("rm")) {
          System.out.println("You have selected the 'rm' command.");
          CreateFilDir new3 = new CreateFilDir();
          new3.delfil();
      }  else if (command.equals("mv")) {
          System.out.println("You have selected the 'mv' command.");
          CreateFilDir new3 = new CreateFilDir();
          new3.mv();
      } else if (command.equals("cp")) {
          System.out.println("You have selected the 'cp' command.");
          File copy1 = new File("C:\\Users\\KarlfromAllState\\eclipse-workspace\\439Proj\\Dir1\\SpecificFile.txt");
          File des1 = new File("C:\\Users\\KarlfromAllState\\eclipse-workspace\\439Proj\\Dir1\\max.txt");
          CreateFilDir.copyDirectoryMode(copy1, des1);
          System.out.println("Specific File has been copied to destination 439 Proj");
      } else if (command.equals("cp -r")) {
          System.out.println("You have selected the 'cp -r' command.");
          File copy1 = new File("C:\\Users\\KarlfromAllState\\eclipse-workspace\\439Proj\\folder");
          File des1 = new File("C:\\Users\\KarlfromAllState\\eclipse-workspace\\439Proj");
          CreateFilDir.copyDirectoryMode(copy1, des1);
          System.out.println("The contents of folder have been transsferred to 439 Proj");
      } else if (command.equals("ls")) {
          System.out.println("You have selected the 'ls' command.");
          CreateFilDir new11 = new CreateFilDir();
          new11.ls();
      } else if (command.equals("pwd")) {
          System.out.println("You have selected the 'pwd' command.");
          CreateFilDir new9 = new CreateFilDir();
          new9.pwd();
      }  else if (command.equals("renamef")) {
    	  System.out.println("You have selected the 'renamef' command.");
          CreateFilDir new11 = new CreateFilDir();
    	  new11.renamefil();
      } else if (command.equals("size")) {
        	  System.out.println("You have selected the 'size' command.");
              CreateFilDir new12 = new CreateFilDir();
        	  new12.size();
      } else if (command.equals("cat")) {
          System.out.println("You have selected the 'cat' command.");
          CreateFilDir new1 = new CreateFilDir();
          new1.echoAppend();
          
      } else {
          System.out.println("Invalid command. Please enter one of the provided commands.");
      }

        // Close Scanner
        scanner.close();
 
	}
		
		

		

}
