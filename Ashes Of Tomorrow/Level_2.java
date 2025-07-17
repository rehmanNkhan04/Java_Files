import java.util.*;
public class Level_2 
{
    private art art = new art();
    private combat combat = new combat(); 

    public boolean startLevel(player p, Scanner sc) throws InterruptedException 
    {
        System.out.println("--- LEVEL 2: The Concrete Labyrinth ---");
        System.out.println("You enter the ruins of a pre-war city, a maze of rubble.");
        art.art3(); //incomplete maze

        // monsters for this level
        monster scrapBeast = new monster("Scrap Metal Beast", 50, 10);
        monster shadowCreature = new monster("Shadowy Creature", 40, 15);

        
        if (!navigateCrossroads1(sc)) return false;

        if (!combat.strtCombat(p, scrapBeast, sc)) return false;
        p.addItem("Scrap Metal Plate"); 

        if (!navigateCrossroads2(sc)) return false;
        
        if (!combat.strtCombat(p, shadowCreature, sc)) return false;
        p.addItem("Medkit");
        p.useItem("Medkit");
        

        System.out.println("After the final confrontation, you see a clear path leading out of the city ruins.");
        art.art4(); //complete maze
        System.out.println("You have successfully navigated the labyrinth.");
        Thread.sleep(1000);
        System.out.println("--- LEVEL 2 COMPLETE ---");
        return true;
    }
    
    private boolean navigateCrossroads1(Scanner sc) 
    {
        System.out.println("You come to a crossroads. Left to 'Market District' or right to 'Subway'.");
        System.out.println("1. Go left.");
        System.out.println("2. Go right.");
        
        while (true) 
        {
            System.out.print("Enter your choice (1 or 2): ");
            int choice = sc.nextInt();
            
            if (choice == 1) 
            {
                System.out.println("You head towards the Market District. The path seems correct.");
                return true;
            } 
            else if (choice == 2) 
            {
                System.out.println("The subway tunnel collapses. Dead end. Game Over.");
                return false;
            } 
            else 
            {
                System.out.println("Invalid choice.");
            }
        }
    }

    private boolean navigateCrossroads2(Scanner sc) 
    {
        System.out.println("Another fork. Up a fire escape or through an alley?");
        System.out.println("1. Fire escape.");
        System.out.println("2. Alley.");
        
        while (true) 
        {
            System.out.print("Enter your choice (1 or 2): ");
            int choice = sc.nextInt();
            if (choice == 2) 
            {
                System.out.println("You brave the alley. It seems to be the right way.");
                return true;
            } 
            else if (choice == 1) 
            {
                System.out.println("The fire escape breaks. You fall. Game Over.");
                return false;
            } 
            else 
            {
                System.out.println("Invalid choice.");
            }
        }
    }
}









