import greenfoot.*;

/**
 * Write a description of class turretbase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TurretBase extends Enemy
{
    private TurretGun gun = new TurretGun();
    private int speed = 3;
    private int health = 5;
    
    /**
     * Act - do whatever the turretbase wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        getWorld().addObject(gun, getX(), getY() );
        if (this.isAtEdge() == true)
        {
            getWorld().removeObject(gun);
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX() - speed, getY() );

        moveGun(speed);
    }
    public void moveGun(int speed)
    {
        gun.setLocation(getX() - speed, getY() );
    }
    
    public void takeDamage(int d)
    {
        health -= d;
        if (health <= 0)
        {
            getWorld().removeObject(gun);
            getWorld().removeObject(this);
            return;
        }
    }
   
}