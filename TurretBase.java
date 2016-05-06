import greenfoot.*;

/**
 * Write a description of class turretbase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TurretBase extends Actor
{
    /**
     * Act - do whatever the turretbase wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX() - 1, getY());
        if (atWorldEdge())
          getWorld().removeObject(this);
    }    
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