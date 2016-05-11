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
    private int shotTimer = 50;
    private GreenfootSound s2 = new GreenfootSound("shot2.wav");
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
        
        if (shotTimer > 0)
        {
            shotTimer--;
        }
        else
        {
        Missile m = new Missile (targetX, targetY);
        m.turnTowards(targetX, targetY);
        getWorld().addObject (m, this.getX(), this.getY());
        s2.setVolume(85);
        s2.play();
        shotTimer = 50;
        }
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
        try
        {
            Stage1 stage1 = (Stage1) getWorld();
            int targetX = stage1.playerShip.getX();
            int targetY = stage1.playerShip.getY();
        
            setLocation(getX() - 1, getY());
       
            shoot(targetX, targetY);
            turnTowards(targetX, targetY);
        }
        catch (IllegalStateException e)
        {
            //do nothing
        }
    }    

}