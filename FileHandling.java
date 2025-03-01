import java.io.*;
//file,filewriter are the classes in io package
import java.util.Scanner;

public class FileHandling
{
    public static void main(String[] args)
    {
        try {
            File Obj = new File("myfile.txt");
             //Creating File
            if (Obj.createNewFile()) // createNewFile() creates an empty file
            {
                System.out.println("File created: " + Obj.getName());
            }
            //to show if the file already exists
            else {
                System.out.println("File already exists.");
            }

             //creating object for file writer to write in the file
            FileWriter Writer = new FileWriter("myfile.txt");
            // Writing File
             Writer.write("File handling in Java is pretty easy compared to c!!");
            //write() writes the spicified byte to the output stream
            Writer.close();
            //close() closes the output stream
           
            //creating object for scanner to read the file
            Scanner Reader = new Scanner(Obj);
             // Traversing File Data
              while (Reader.hasNextLine()) 
              //hasNextLine() returns true if there is line of text available in the scanner
              {
                String data = Reader.nextLine();
                //nextLine() is used to store the user's input of string type(here the lines in the file)
                System.out.println(data);
            }
          
            Reader.close();
            //close() closes the input stream
        }
      
          // Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
