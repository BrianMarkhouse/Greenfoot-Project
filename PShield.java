import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * player shield
 * 
 * @author Brian Markhouse
 * @version (a version number or a date)
 */
public class PShield extends Actor
{
    private int health = 3;
     
    public PShield()
    {
        setImage("PShield.png");
    }
    public void takeDamage(int d)
    {
        health -= d;
        if (health <= 0)
        {
            getWorld().removeObject(this);
            return;
        }
    }
    public void act() 
    {
        
    }    
}
