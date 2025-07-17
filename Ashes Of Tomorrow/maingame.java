import java.io.File;
import java.util.*;
public class maingame
{
    static saveLoad gameSaved = new saveLoad();
    static Text txt = new Text();

    String name;
    String personality;
    String role;

    public static void main(String[] args) throws InterruptedException 
    {
        saveLoad gameSaved = new saveLoad();
        player p = new player(null, null);

        Text txt=new Text();
        txt.introtext();
        art obj2=new art(); // Ashes of tomorrow game name

        obj2.art1();
        Thread.sleep(1500);
        
        txt = new Text();
        txt.introtext2();
        Thread.sleep(2500);

        art obj5 = new art();
        obj5.art2();
        Thread.sleep(1000);
        
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        
            txt = new Text();
            txt.introtext3();

            System.out.println("[PRESS ENTER TO BEGIN]");
            sc.nextLine();

        File saveFile = new File("save.txt");
        if (saveFile.exists()) {
            System.out.println("A previous journey has been recorded.");
            System.out.println("1. Start a New Game");
            System.out.println("2. Load Game");
            System.out.print("Enter your choice (1 or 2): ");
            int choice = sc.nextInt();
            if (choice == 2) 
            {

                p = gameSaved.loadGame();
                if (p != null) 
                {
                    System.out.println("\nWelcome back, " + p.getName() + ".");
                    p.displayCharProfile();
                } 
                else 
                {
                    // If loading fails, start a new game.
                    System.out.println("Failed to load save file. Starting a new game.");
                    p = startNewGame(sc, txt);
                }
            } 
            else 
            {
                p = startNewGame(sc, txt);
            }
        }
        else
        {
            p = new player(p.getName(), p.getRole());
        }

        if (p.getCurrentLevel() == 1) 
        {
            Level_1 lvl1 = new Level_1();
            if (!lvl1.startLevel1(p, sc)) 
            {
                endGame(sc);
                return;     
            }
            p.setCurrentLevel(2);
            gameSaved.saveGame(p);
        } 

        if (p.getCurrentLevel() == 2) 
        {
            Level_2 lvl2 = new Level_2();
            if (!lvl2.startLevel(p, sc)) 
            {
                endGame(sc);
                return;     
            }           
            p.setCurrentLevel(3);
            gameSaved.saveGame(p);
        }

        if (p.getCurrentLevel() == 3) 
        {
            Level_3 lvl3 = new Level_3();
            lvl3.startLevel(p, sc);
        }

        gameSaved.saveGame(p);
        endGame(sc);
    }

    public static player startNewGame(Scanner sc, Text txt) throws InterruptedException
    {
        txt.introtext4();

        while (true) 
        {
            String option =  sc.nextLine();
            if (option.equalsIgnoreCase("yes")) 
            {
                txt.introtext5();
                break;
            }
            else if (option.equalsIgnoreCase("no")) 
            {
                System.out.println("You close your eyes and accecpt the end..");
                endGame(sc);
                System.exit(0); //exit the program      
            } 
            else
            {
                System.out.println("Wrong input. Please enter [YES] OR [NO]");
            }
            
        }

        player p = createChar(sc);
        p.displayCharProfile();;
        System.out.println("Your journey begins, " + p.getName());
        System.out.println("[PRESS ENTER TO BEGIN]");
        sc.nextLine();
        return p;
    }

    public static player createChar(Scanner sc)
    {
        System.out.println("--- CHARACTER CREATION ---");
        System.out.print("Enter your character's name: ");
        String name = sc.nextLine();

        String role = "";
        while (true) {
            System.out.println("\nChoose your role:");
            System.out.println("1. Brawler (Close quarter combat)");
            System.out.println("2. Shooter (Never misses)");
            System.out.print("Enter your choice (1 or 2): ");
            String roleChoice = sc.nextLine();
            if (roleChoice.equals("1")) {
                role = "Brawler";
                System.out.println("You chose: " + role);
                break;
            } else if (roleChoice.equals("2")) {
                role = "Shooter";
                System.out.println("You chose: " + role);
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
        
        return new player(name, role);
    }

    public static void endGame(Scanner sc) 
    {
         System.out.println("Thank you for playing Ashes of Tomorrow. Hope it was a captivating experience.");
    }

}





