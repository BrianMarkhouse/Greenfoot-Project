import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Missile is a projectile that will fly towards its destination, updating
 * its trajectory as it flies to avoid bugs related to rounding in the 
 * turnTowards(x,y) method.
 * 
 * @author Jordan Cohen
 * @version May 2013
 */
public class Missile extends Projectile
{
    // Class Variables:
    private int targX, targY;
    private boolean hitTarget;
    private int speed;
   
    /**
     * Construct a Missile given a target coordinate
     * 
     * @param int   Target x coordinate
     * @param int   Target y coordinate
     */
    public Missile (int targX, int targY)
    {
        this.targX = targX;
        this.targY = targY;
        hitTarget = false;
        speed = 10;
    }

    public void act() 
    {
        if(isTouching(PlayerShip.class) )
        {
            removeTouching(PlayerShip.class);
            getWorld().removeObject(this);
            return;
        }
        // If I have come within 10 pixels of my destination, I no longer
        // want to update my direction as I am close enough:
        if (Math.abs(getX() - targX) < 10 && Math.abs(getY() - targY) < 10)
            hitTarget = true;
        // If I am not yet close to my destination, update my trajectory
        if (!(hitTarget))
            turnTowards(targX, targY);
        // Move in the direction I am facing
        move(speed);
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
