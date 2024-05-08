package Dir1;
import java.util.*;
import java.io.*;

public class mainf {

	public static void main(String[] args) throws IOException {
		// TODO import java.io.*;
		 // Display home screen
        System.out.println("Welcome to File Management Simulation in Java!");
        System.out.println("You can explore File Management using the following commands:");
        System.out.println("- touch");
        System.out.println("- mkdir");
        System.out.println("- rm");
        System.out.println("- mv");
        System.out.println("- cp");
        System.out.println("- cp -r");
        System.out.println("- ls");
        System.out.println("- pwd");
        System.out.println("- renamef");
        System.out.println("- cat");
        System.out.println("- size");
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("Enter the command you want to use: (type quit to exit)");
        String command = scanner.nextLine().trim().toLowerCase(); // Read u
        
        

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
          CreateFilDir new1 = new CreateFilDir();
          new1.mkdir();
      } else if (command.equals("rm")) {
          System.out.println("You have selected the 'rm' command.");
          CreateFilDir new1 = new CreateFilDir();
          new1.delfil();
      }  else if (command.equals("mv")) {
          System.out.println("You have selected the 'mv' command.");
          CreateFilDir new1 = new CreateFilDir();
          new1.mv();
      } else if (command.equals("cp")) {
          System.out.println("You have selected the 'cp' command.");
          Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the file's location you would like to copy (with 2 \\):  ");
	        String source = scan.nextLine();
	        System.out.print("Enter where you would like to copy the file to (include the copy's name): ");
	        String copy = scan.nextLine();
	        
          File copy1 = new File(source);
          File des1 = new File(copy);
          CreateFilDir.copyDirectoryMode(copy1, des1);
          System.out.println("Specific File has been copied to destination Dir1 (max.txt)");
      } else if (command.equals("cp -r")) {
          System.out.println("You have selected the 'cp -r' command.");
          Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the file's location you would like to copy (with 2 \\):  ");
	        String source = scan.nextLine();
	        System.out.print("Enter where you would like to copy the file to (include the copy's name): ");
	        String copy = scan.nextLine();
          File copy1 = new File(source);
          File des1 = new File(copy);
          CreateFilDir.copyDirectoryMode(copy1, des1);
          System.out.println("The contents of testfolder1 have been transferred to folder");
      } else if (command.equals("ls")) {
          System.out.println("You have selected the 'ls' command.");
          CreateFilDir new1 = new CreateFilDir();
          new1.ls();
      } else if (command.equals("pwd")) {
          System.out.println("You have selected the 'pwd' command.");
          CreateFilDir new1 = new CreateFilDir();
          new1.pwd();
      }  else if (command.equals("renamef")) {
    	  System.out.println("You have selected the 'renamef' command.");
          CreateFilDir new1 = new CreateFilDir();
    	  new1.renamefil();
      } else if (command.equals("size")) {
        	  System.out.println("You have selected the 'size' command.");
              CreateFilDir new1 = new CreateFilDir();
        	  new1.size();
      } else if (command.equals("cat")) {
          System.out.println("You have selected the 'cat' command.");
          CreateFilDir new1 = new CreateFilDir();
          new1.echoAppend();
          
      } else if (command.equals("quit")){
    	  System.out.println("Exiting program...");
          break;
          
      }
      else {
          System.out.println("Invalid command. Please enter one of the provided commands.");
      }

        // Close Scanner
        
 
	}
        scanner.close();
	}	
		

		

}
