import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss1Body here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss1Body extends Actor
{
    private int shotTimer = 50;
    public void shoot (int targetX, int targetY)
    {
        if (shotTimer > 0)
        {
            if (shotTimer == 25)
            {
                Missile m = new Missile (targetX, targetY);
                m.turnTowards(targetX, targetY);
                getWorld().addObject (m, this.getX()-80, this.getY()-80);
            }
            shotTimer--;
        }
        else
        {
        Missile m = new Missile (targetX, targetY);
        m.turnTowards(targetX, targetY);
        getWorld().addObject (m, this.getX()-80, this.getY()+80);
        shotTimer = 50;
        }
    }
    /**
     * Act - do whatever the Boss1Body wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        try
        {
            Stage1 stage1 = (Stage1) getWorld();
            int targetX = stage1.playerShip.getX();
            int targetY = stage1.playerShip.getY();
            shoot(targetX, targetY);
        }
        catch (IllegalStateException e)
        {
            //do nothing
        }
    }    
}
