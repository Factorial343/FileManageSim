package Dir1;
import java.util.*;
import java.io.*;

public class CreateFilDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public void mkfil(){
		  Scanner scan = new Scanner (System.in);
		  System.out.print("Input: ");
		  String name = scan.nextLine();
		    try {
		        File myObj = new File(name);
		        if (myObj.createNewFile()) {
		          System.out.println("File created: " + myObj.getName());
		        } 
		      } catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
		    }
		  public void mkfilspec(){
			    try {  
			        File OBJ = new File("C:\\Users\\KarlfromAllState\\eclipse-workspace\\439Proj\\Dir1\\SpecificFile.txt");  
			        if (OBJ.createNewFile()) {  
			          System.out.println("File created: " + OBJ.getName());  
			          System.out.println("Absolute path: " + OBJ.getAbsolutePath());  
			        } else {  
			          System.out.println("File already exists.");  
			        }  
			      } catch (IOException e) {
			        System.out.println("An error occurred.");
			        e.printStackTrace();  
			      }  
			  }
		  public void delfil() {
			  Scanner scan = new Scanner (System.in);
			  System.out.print("Input: ");
			  String name = scan.nextLine();
		
			        File myObj = new File(name);
			        if (myObj.exists()) {
			        	System.out.println("File deleted: " + myObj.getName());
			        	myObj.delete();
			        }
			        else {
			        	System.out.println("File not found: " +name);
			        }
		  }
		  public void mkdir() {
			  Scanner scan = new Scanner (System.in);
			  System.out.print("Input: ");
			  String name = scan.nextLine();
			  File myObj = new File(name);
			  boolean folder = myObj.mkdirs();
			  System.out.println("Folder created: " + myObj.getName());
			  
		  }
		  public void pwd() {
			  System.out.println("Working Directory = " + System.getProperty("user.dir"));
		  }
		  public void renamefil() {
			  Scanner scan = new Scanner (System.in);
			  System.out.print("Input File to be renamed: ");
			  String name = scan.nextLine();
			  File myObj = new File(name);
			  System.out.print("What would you like to rename the file to?: ");
			  String nameto = scan.nextLine();
			  File otherObj = new File(nameto);
			  if(myObj.exists()) {
			  System.out.println(name + " has been renamed to "+ nameto);
			  myObj.renameTo(otherObj);
			  
			  }
			  else {
				  System.out.println("An error in naming has occured");
			  }
		  }
		  public void size() {
			  Scanner scan = new Scanner (System.in);
			  System.out.print("Input: ");
			  String name = scan.nextLine();
			  File myObj = new File(name);
			   System.out.println("The size of "+myObj.getName()+" is "+ myObj.length());
		  }
		  public static void copyDirectory (File sourceDirectory, File destinationDirectory) throws IOException {
		        if(!destinationDirectory.exists()){ //checks that destination directory exists, if it doesn't a new directory is created.
		            destinationDirectory.mkdir();
		        }
		        for(String s : sourceDirectory.list()){ //for-each loop to iterate over the sourceDirectory 
		            //sourceDirectory.list() returns an array of Strings that names the files and directories in the original directory
		            copyDirectoryMode(new File(sourceDirectory, s), new File(destinationDirectory, s)); //calls copyDirectoryMode method to copy the Directory
		       		 }
		    	}
		    	public static void copyDirectoryMode(File source, File dest) throws IOException{ //determines if given source is a file or a directory
		        	if(source.isDirectory()){
		            copyDirectory(source, dest); //if directory iteratively calls copyDirectory method
		        		}
		        	else{
		            copyFile(source,dest); //if file calls the copyFile method
		        		}
		    } 
		    
		    	public static void copyFile(File sourceFile, File destFile) throws IOException{
		        try(InputStream in = new FileInputStream(sourceFile); OutputStream out = new FileOutputStream(destFile))  //declaring the resources
		        // try-with resources statement. Resource is an object that must be closed after program is finished with it. Prevents waste.
		        { //reading from in and writing to out
		            byte [] buffer = new byte[1024]; //declaring a byte array of size 1024 
		            int length;
		            while((length = in.read(buffer)) > 0 ){  //read method of inputStream is called and returns number of bytes read if no bytes read (-1) it terminates the loop bc we have reached the end of the stream.
		                out.write(buffer,0,length); //read data is then written to the outputstream using write method. 
		            }
		        }
		    }
		    	
		    	public void echoAppend() {

		    	Scanner scan = new Scanner(System.in);
		        System.out.print("Enter file name to append to: ");
		    	String name = scan.nextLine();
		        System.out.print("Enter text to append: ");
		    	String text = scan.nextLine();
		    	try {
		        	FileWriter myWriter = new FileWriter(name, true);
		            myWriter.write(text + "\n");
		            myWriter.close();
		            System.out.println("Appended to file: " + name);
		    	} catch (IOException e) {
		            System.out.println("An error occurred.");
		            e.printStackTrace();
		    	}
			}
		    	public void ls(){
		    		// Get the current directory
		    		File currentDir = new File(".");
		    		
		    		// List files and directories
		    		File[] files = currentDir.listFiles();
		    		if (files != null) {
		    			for (File file : files) {
		    				System.out.println(file.getName());
		    			}
		    		}
		    	}
		    	 public void mv() {
		    	        Scanner scanner = new Scanner(System.in);

		    	        System.out.print("Enter the source file/directory path: ");
		    	        String source = scanner.nextLine();

		    	        System.out.print
		    			("Enter the destination file/directory path (As if the file is already in the spot you want to move it to): ");
		    	        String destination = scanner.nextLine();

		    	        File sourceFile = new File(source);
		    	        File destFile = new File(destination);

		    	        if (sourceFile.renameTo(destFile)) {
		    	            System.out.println(source + " moved successfully to "+ destination);
		    	        } else {
		    	            System.out.println("Failed to move file/directory.");
		    	        }

		    	        
		    	    }

		




}
