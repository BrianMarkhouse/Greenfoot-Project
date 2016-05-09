import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WepPow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WepPow extends Actor
{
    private int speed = 3;
    /**
     * Act - do whatever the WepPow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (this.isAtEdge() == true)
        {
            getWorld().removeObject(this);
            return;
        }
        if (isTouching(PlayerShip.class) )
        {
            PlayerShip p = (PlayerShip)getOneIntersectingObject(PlayerShip.class);
            p.levelWeaponUp();
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX() - speed, getY() );
    }    
}
