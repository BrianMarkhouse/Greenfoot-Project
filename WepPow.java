import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * increases the weapon level of the player when they pass over this
 * @author Brian Markhouse
 * @version (a version number or a date)
 */
public class WepPow extends Actor
{
    private int speed = 3;

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
