import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Canon uses the turnToward(int x, int y) method as borrowed from the open source code
 * of Greenfoot 2.2.1. This class does not act on it's own, but instead takes commands from
 * its owner.
 * 
 * @Jordan Cohen
 * @June 2012
 */
public class TurretGun extends Actor
{   
    // Aim toward x and y values passed in as parameters
    public void aim (int x, int y)
    {
        // turn towards x and y position provided by caller
        // this method is called by the mouse reader
        this.turnTowards (x, y);
        
    }
    
    // public method to "shoot" a canon ball in the direction this canon is currently facing
    public void shoot (int targetX, int targetY)
    {
        Missile m = new Missile (targetX, targetY);
        getWorld().addObject (m, this.getX(), this.getY());
    }
    
    /**
     * This is the turnTowards method from Greenfoot 2.2.0 and higher. I modified it
     * to work in any Actor in Greenfoot 2.1. It requires the x and y coordinate you wish
     * to point this Actor towards
     */
    public void turnTowards (int x, int y)
    {
        double a = Math.atan2(y - this.getY(), x - this.getX());
        setRotation((int) Math.toDegrees(a));
    }
        public void act() 
    {
        // Add your action code here.
        setLocation(getX() - 1, getY());
                // get the current state of the mouse
        MouseInfo m = Greenfoot.getMouseInfo();
        // if the mouse is on the screen...
        if (m != null)
        {
            // aim the canon at the mouse
            this.aim (m.getX(), m.getY());
            // if the mouse button was pressed
            if (Greenfoot.mousePressed(null))
            {
                // shoot
                this.shoot(m.getX(), m.getY());
            }
        }
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