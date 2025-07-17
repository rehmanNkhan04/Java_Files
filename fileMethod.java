import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
public class fileMethod 
{
    public void fileCreation(String name)
    {
        try {
            File file1 = new File(name+".txt");
            if (file1.createNewFile()) 
            {
                System.out.println("The File has been created and it's name is\t" + file1.getName());
            } else {
                System.out.println("File already exists");               
            }
        } catch (Exception e) 
        {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
    public void filewriting(String name, String content)
    {
        try 
        {
            FileWriter f2 = new FileWriter(name+".txt");
            f2.write(content);
            f2.close();   
        } catch (IOException e) 
        {
            System.out.println("An error has occured");
            e.printStackTrace();
            // TODO: handle exception
        }
    }
    public void fileReading(String name)
    {
        try 
        {
            File f2 = new File(name+".txt");
            Scanner obj = new Scanner(f2);
            while (obj.hasNextLine()) 
            {
                String data = obj.nextLine();
                System.out.println(data);                
            }   
        } catch (FileNotFoundException e) 
        {
            System.out.println("An error has occured");
            e.printStackTrace();
            // TODO: handle exception
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, content;
        int choice;
        System.out.println("Enter your file name");
        name = sc.nextLine();
        fileMethod f = new fileMethod();
        f.fileCreation(name);
        System.out.println("Do you want to write content onto the file (for YES press 1, for NO press 0)");
        choice = sc.nextInt();
        if (choice == 1) 
        {
            System.out.println("Enter the content you want to write on the file");
            sc.nextLine();
            content = sc.nextLine();
            f.filewriting(name, content);            
        }
        f.fileReading(name);
    }    
}
