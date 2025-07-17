import java.util.Scanner;

public class Level_3 
{
    private combat combat = new combat();

    public void startLevel(player p, Scanner sc) throws InterruptedException 
    {
        System.out.println("--- LEVEL 3: The Sanctuary's Core ---");
        System.out.println("You've arrived at a massive pre-war bunker. A Temporal Guardian blocks the main chamber.");

        // Final fight
        monster temporalGuardian = new monster("Temporal Guardian", 80, 20);
        if (!combat.strtCombat(p, temporalGuardian, sc)) {
           
            return;
        }
        
        System.out.println("With the guardian defeated, you find a locker. You loot a strange device from it.");
        p.addItem("Temporal Beacon");

        // Final Choice 
        System.out.println("In the central chamber, a temporal rift pulses. A console offers four options.");
        Thread.sleep(1000);
        System.out.println("1. Go back to 1950. Stop the nuclear fallout.");
        System.out.println("2. Live life as it is. Continue as you are.");
        System.out.println("3. Go 100 years into the future.");
        System.out.println("4. Go to a parallel timeline where the fallout never happened.");

        while (true) 
        {
            System.out.print("Enter your final choice (1, 2, 3, or 4): ");
            int choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    endingSavior();
                    return;
                case 2:
                    endingSurvivorDeath();
                    return;
                case 3:
                    endingFutureDeath();
                    return;
                case 4:
                    endingEscapee();
                    return;
                default:
                    System.out.println("Invalid choice. The timeline is unstable, choose carefully.");
            }
        }
    }
    
    
    private void endingSavior() throws InterruptedException 
    {
        System.out.println("You travel to 1950. You successfully prevent the bombings and stop the nuclear arms race. Or so you think, but in actuality you were one of the people who caused it");
        Thread.sleep(1000);
        System.out.println("The world is saved from the ashes of tomorrow. You have won.");
        Thread.sleep(1000);
        System.out.println("--- ENDING: The Savior ---");
    }

    private void endingSurvivorDeath() throws InterruptedException 
    {
        System.out.println("You choose to stay. The world is broken, but it is your world.");
        Thread.sleep(1000);
        System.out.println("One day, while scavenging, you are overwhelmed by a horde of creatures. Your journey ends.");
        System.out.println("--- GAME OVER ---");
    }

    private void endingFutureDeath() throws InterruptedException 
    {
        System.out.println("You jump 100 years forward. Robots greet you. GREETING, SPECIMEN. YOU ARE... LATE.");
        Thread.sleep(1000);
        System.out.println("They disintegrate you. Humanity was replaced, not saved.");
        System.out.println("--- GAME OVER ---");
    }

    private void endingEscapee() throws InterruptedException 
    {
        System.out.println("You leap to a peaceful, parallel world. It is not your home, but it is safe.");
        Thread.sleep(1000);
        System.out.println("You have won the game. Congrats.");
        Thread.sleep(1000);
        System.out.println("--- ENDING: The Escapee ---");
    }

}









