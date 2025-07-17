public class monster 
{
    String name;
    int health;
    int damage;

    public monster(String name, int health, int damage)
    {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void takeDamage(int amount)
    {
        this.health -= amount;
        
        if (this.health < 0) 
        {
            this.health = 0;      
        }
        
        System.out.println("The " + this.name + " takes " + amount + " damage! Its health is now " + this.health);
    }
    
    public boolean isAlive()
    {
        return this.health > 0;
    }

    public String getName() 
    {
        return this.name;
    }
    
    public int getDamage()
    {
        return this.damage;
    }

}






