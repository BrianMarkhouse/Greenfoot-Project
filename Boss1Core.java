import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss1Core here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss1Core extends Enemy
{
    private Boss1Body body = new Boss1Body();
    private int health = 100;
    private int shotTimer = 50;
    /**
     * Act - do whatever the Heavy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().addObject(body, getX(), getY() );
        shoot();
    }
    public void takeDamage(int d)
    {
        health -= d;
        if (health <= 0)
        {
            Stage1 s = (Stage1)getWorld();
            s.removeObject(body);
            s.victory();
            s.removeObject(this);
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
        shotTimer = 50;
        }
    }  
}
