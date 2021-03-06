import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Heavy enemy
 * 
 * @author Brian Markhouse
 * @version (a version number or a date)
 */
public class Heavy extends Enemy
{
    private int health = 3;
    private int speed = 60;
    private int shotTimer = 10;
    private int score = 300;
    private GreenfootSound s2 = new GreenfootSound("shot2.wav");
    
    public void act() 
    {
         if (this.isAtEdge() == true)
        {
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX() - speed/5, getY() ); // the division of speed causes speed to change at a slower rate
        speed--;
        shoot();
    }
    public void takeDamage(int d)
    {
        health -= d;
        if (health <= 0)
        {
            int a = Greenfoot.getRandomNumber(3);
            if (a == 2)
            {
                getWorld().addObject(new WepPow(), getX(), getY() ); //chance to spawn weapon power up
            }
            Stage1 stage = (Stage1)getWorld();
            stage.addScore(score);
            getWorld().removeObject(this);
            return;
        }
    }
    public void shoot ()
    {
        if (shotTimer > 0)
        {
            shotTimer--;
        }
        else
        {
        getWorld().addObject (new HeavyShot(), this.getX(), this.getY());
        shotTimer = 30;
        s2.setVolume(85);
        s2.play();
        }
    }
    
}
