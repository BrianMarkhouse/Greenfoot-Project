import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * large enemy projectile without any tracking
 * 
 * @author Brian Markhouse
 * @version (a version number or a date)
 */
public class HeavyShot extends Projectile
{
    private int speed = 10;
    public void act() 
    {
        if(isTouching(PlayerShip.class) )
        {
            removeTouching(PlayerShip.class);
            getWorld().removeObject(this);
            return;
        }
        // Move in the direction I am facing
        move(-speed);
        // Check if I am at the edge of the World, and if so, remove myself
        if (atWorldEdge())
            getWorld().removeObject(this);
    }    

    /**
     * Checks if this Actor is at the edge of the World
     * 
     * @return boolean  true if at edge of the World, otherwise false
     */
    public boolean atWorldEdge ()
    {
        int maxX = getWorld().getBackground().getWidth();
        int maxY = getWorld().getBackground().getHeight();
        if (getX() <= 0 || getX() >= maxX - 1)
        { return true; }
        if (getY() <= 0 || getY() >= maxY - 1)
        { return true; }
        return false;
    }    
}
