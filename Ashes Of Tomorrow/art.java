import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class art 
{

    public void art1()
    {
        try
    {
        File f2 = new File("AshesOfTomorrow.txt");
        Scanner obj = new Scanner(f2);
        while (obj.hasNextLine()) {
            String data = obj.nextLine();
            System.out.println(data);
        }

    } 
    catch(FileNotFoundException e)
    {
        System.out.println("An error occured");
        e.printStackTrace();
    }
}

public void art2()
    {
        try
    {
        File f2 = new File("nuc1.txt");
        Scanner obj2 = new Scanner(f2);
        while (obj2.hasNextLine()) {
            String data = obj2.nextLine();
            System.out.println(data);
        }

    } catch(FileNotFoundException e){
        System.out.println("An error occured");
        e.printStackTrace();
    }
    
    }

    public void art3()
    {
        try 
        {
            File f3 = new File("maze.txt");
            Scanner sc = new Scanner(f3);
            while (sc.hasNextLine()) 
            {
                String data = sc.nextLine();
                System.out.println(data);                
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    public void art4()
    {
        try 
        {
            File f4 = new File("maze completed.txt");
            Scanner sc = new Scanner(f4);
            while (sc.hasNextLine()) 
            {
                String data = sc.nextLine();
                System.out.println(data);                
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
    
}






