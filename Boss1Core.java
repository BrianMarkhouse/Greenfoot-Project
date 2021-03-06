import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Boss1's core
 * 
 * @author Brian Markhouse
 * @version (a version number or a date)
 */
public class Boss1Core extends Enemy
{
    private Boss1Body body = new Boss1Body();
    private int health = 100;
    private int shotTimer = 50;
    private int score = 10000;
    private GreenfootSound bs = new GreenfootSound("shot2.wav");


    public void act() 
    {
        getWorld().addObject(body, getX(), getY() );
        shoot();
    }
    public void takeDamage(int d)
    {
        health -= d;
        if (health <= 0)
        {
            Stage1 s = (Stage1)getWorld();
            s.addScore(score);
            s.removeObject(body);
            s.gameOver();
            s.removeObject(this);
            
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
        bs.play();
        shotTimer = 50;
        }
    }  
}
