import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * increases the weapon level of the player when they pass over this
 * @author Brian Markhouse
 * @version (a version number or a date)
 */
public class WepPow extends Actor
{
    private int speed = 3;
    private int score = 200;

    public void act() 
    {
        if (this.isAtEdge() == true)
        {
            Stage1 stage = (Stage1)getWorld();
            stage.addScore(score);
            stage.removeObject(this);
            return;
        }
        if (isTouching(PlayerShip.class) )
        {
            PlayerShip p = (PlayerShip)getOneIntersectingObject(PlayerShip.class);
            p.levelWeaponUp();
            Stage1 stage = (Stage1)getWorld();
            stage.addScore(score);
            stage.removeObject(this);
            return;
        }
        setLocation(getX() - speed, getY() );
    }    
}
