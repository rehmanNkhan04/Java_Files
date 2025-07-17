import java.util.*;
public class combat 
{
    public boolean strtCombat(player p, monster m, Scanner sc)
    {
        System.out.println("--- COMBAT START ---");
        System.out.println("A wild " + m.getName() + " appears!");
        Random random = new Random();
        

        // The combat loop continues as long as both are alive.
        while (p.isAlive() && m.isAlive()) {
           // Player's turn
            System.out.println("Your turn. What will you do?");
            System.out.println("PRESS 1: Attack");
            System.out.println("PRESS 2: Check Inventory");
            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();


            if (choice.equals("1")) {
                // Calculate player damage
                int playerDamage = 0;
                if (p.getRole().equals("Brawler")) 
                {
                    playerDamage = random.nextInt(15) + 10; 
                } 
                else 
                {
                    playerDamage = random.nextInt(10) + 15; 
                }
                m.takeDamage(playerDamage);
            } 
            else if (choice.equals("2")) 
            {
                p.displayInventory();
                p.useItem("Medkit");
                continue; // Skip the monster's attack this turn.
            } 
            else 
            {
                System.out.println("You hesitate and lose your chance!");
            }

            // Monster's turn
            if (m.isAlive()) 
            {
                System.out.println("The " + m.getName() + " attacks!");
                p.takeDamage(m.getDamage());
            }
        }

        // Result of the combat.
        if (p.isAlive()) 
        {
            System.out.println("You have defeated the " + m.getName() + "!");
            System.out.println("--- COMBAT END ---");
            return true; 
        } 
        else 
        {
            System.out.println("You have been defeated by the " + m.getName() + ".");
            System.out.println("--- GAME OVER ---");
            return false; 
        }
    }
}





