import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PShot3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PShot3 extends PShot
{
    private int speed = 15;
    private int damage = 3;
    
    /**
     * Act - do whatever the PShot1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        // Check if I am at the edge of the World, and if so, remove myself
        if (atWorldEdge())
        {
            getWorld().removeObject(this);
            return;
        }
        if (isTouching(Surge.class) || isTouching(SurgeC.class) )
        {
            Enemy e = (Enemy)getOneIntersectingObject(Enemy.class);
            e.takeDamage(damage);
            damage--;
            if (damage <= 0)
            {
                getWorld().removeObject(this);
                return;
            }
        }
        else if (isTouching(Enemy.class) )
        {
            Enemy e = (Enemy)getOneIntersectingObject(Enemy.class);
            e.takeDamage(damage);
            getWorld().removeObject(this);
            return;
        }
    
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
