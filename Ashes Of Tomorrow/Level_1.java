import java.util.*;

public class Level_1 
{
    public boolean startLevel1(player p, Scanner sc) throws InterruptedException
    {
        System.out.println("--- LEVEL 1: The Den of Whispers ---");
        Thread.sleep(1000);
        System.out.println("Your Journey begins at the mouth of the dark cave, a known den of mutated beast. ");
        System.out.println("To pass, you must confront what lies within. You venture into the darkness.");
        Thread.sleep(1000);
        System.out.println("Inside, you find a den of grotesque monsters, their eyes glowing in the gloom.");
        System.out.println("They are gathered around a larger, whimpering creature - the den mother, clearly in pain.");
        Thread.sleep(1000);
        System.out.println("The other monsters are agitated but not immediately hostile, watching you, waiting.");
        System.out.println(p.getName() + ", what, will you do?");
        Thread.sleep(1000);
        System.out.println("1. This is a threat. Kill all of them.");
        System.out.println("2. The mother is the source. Kill only the den mother.");
        System.out.println("3. These creatures are just surviving, like me. Leave them in peace.");
        Thread.sleep(1000);
        
        while (true) 
        {
            System.out.print("Enter your choice (1, 2, or 3): ");
            String choice = sc.nextLine();

            switch (choice) {
                
                case "1":
                    System.out.println("You draw your weapon and charge. The battle is brutal and bloody.");
                    Thread.sleep(1000);
                    System.out.println("You have become the monster you sought to destroy.");

                    System.out.println("--- GAME OVER ---");
                    return false;
                
                case "2":
                    System.out.println("You target the mother, thinking it's a mercy killing. The other creatures shriek in terror and rage.");
                    Thread.sleep(1000);
                    System.out.println("Your 'mercy' was just cruelty in disguise.");
                    System.out.println("--- GAME OVER ---");
                    return false;
                
                case "3":
                    System.out.println("\nYou lower your weapon, seeing not monsters, but a family protecting their own.");
                    System.out.println("You slowly back away, leaving the den in peace.");
                    Thread.sleep(1000);
                    System.out.println("As you step back into the light, you notice a discarded pouch near the cave entrance.");
                    p.addItem("Tattered Map");
                    System.out.println("A profound thought strikes you...");
                    Thread.sleep(1000);
                    System.out.println("'You realized that humanity was the stain all along.'");
                    System.out.println("--- LEVEL 1 COMPLETE ---");
                    return true;
                
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}







