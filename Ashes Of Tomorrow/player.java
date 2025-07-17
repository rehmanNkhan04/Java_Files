import java.util.*;

public class player
{
    private String name;
    private String role;
    private ArrayList<String> inventory;
    private int health;
    private int currentLvl;

    public player(String name, String role) //for new game data
    {
        this.name = name;
        this.role = role;
        this.health = 100;
        this.currentLvl = 1;
        this.inventory = new ArrayList<String>();
    }

    public player(String name, String role, int health, int currentLvl, ArrayList<String> inventory) //saved data for loaded game
    {
        this.name = name;
        this.role = role;
        this.health = health;
        this.currentLvl = currentLvl;
        this.inventory = inventory;
    }
    

    public void displayCharProfile()
    {
        System.out.println("---Character Profile---");
        System.out.println("Name: " + this.name);
        System.out.println("Role: " + this.role);
        System.out.println("Health " + this.health);
        displayInventory();
    }

    public void displayInventory()
    {
        System.out.println("---Inventory---");
        if (inventory.isEmpty()) 
        {
            System.out.println("Your pockets are empty.");
        } 
        else 
        {
            for (String item : inventory) 
            {
                System.out.println(" " + item);                
            }   
        }
    }

    public void addItem(String item)
    {
        this.inventory.add(item);
        System.out.println("You picked up: " + item);
    }
    public boolean useItem(String item)
    {
        this.inventory.indexOf(item);
        System.out.println("You used: " + item);
        return true;
    }

    public void takeDamage(int amount)
    {
        this.health -= amount;
        if (this.health < 0) {
            this.health = 0;
        } System.out.println(this.name + " took " + amount + " damage! Current health: " + this.health);
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void setCurrentLevel(int level) 
    {
        this.currentLvl = level; 
    }

    public String getName()
    {
        return this.name;
    }

    public String getRole()
    {
        return this.role; 
    }

    public int getHealth()
    {
        return this.health; 
    }

    public int getCurrentLevel()
    {
        return this.currentLvl; 
    }
    public ArrayList<String> getInventory()
    {
        return this.inventory; 
    }

}







