import java.io.*;
import java.util.*;

public class saveLoad 
{
    private static final String saveFile = "save.txt";

    public void saveGame(player p)
    {
        try (PrintWriter w = new PrintWriter(new FileWriter(saveFile)))
        {
            w.println(p.getName());
            w.println(p.getRole());
            w.println(p.getHealth());
            w.println(p.getCurrentLevel());

            for (String item : p.getInventory()) 
            {
                w.println(item);
            }

            System.out.println("[GAME PROGRESS SAVED]");

        } 
        catch (IOException e) 
        {
            System.err.println("Error: [UNABLE TO SAVE GAME PROGRESS. TRY AGAIN!]" + e.getMessage());
        }
    }

    public player loadGame()
    {
        try (Scanner sc = new Scanner(new File(saveFile)))
        {
            String name = sc.nextLine();
            String role = sc.nextLine();
            int health = Integer.parseInt(sc.nextLine());
            int level = Integer.parseInt(sc.nextLine());

            ArrayList<String> inventory = new ArrayList<>();
            while (sc.hasNextLine()) 
            {
                inventory.add(sc.nextLine());
            }

            System.out.println("[GAME LOADED SUCCESFULLY!]");
            return new player(name, role, health, level, inventory);
            
        }
        catch (Exception e) 
        {
            System.err.println("Error loading the game: The save file might be corrupted.");
            return null;
        }
    }
}



