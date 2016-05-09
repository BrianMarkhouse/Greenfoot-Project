import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heavy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heavy extends Enemy
{
    private int health = 3;
    private int speed = 40;
    private int shotTimer = 10;
    /**
     * Act - do whatever the Heavy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (this.isAtEdge() == true)
        {
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX() - speed/4, getY() );
        speed--;
        shoot();
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
    public void shoot ()
    {
        if (shotTimer > 0)
        {
            shotTimer--;
        }
        else
        {
        getWorld().addObject (new HeavyShot(), this.getX(), this.getY());
        shotTimer = 30;
        }
    }
    
}
