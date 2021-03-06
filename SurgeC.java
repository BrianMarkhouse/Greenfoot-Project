import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * surge that is spawned by the first surge of the group
 * 
 * @author Brian Markhouse 
 * @version (a version number or a date)
 */
public class SurgeC extends Enemy
{
    private int health = 1;
    private int speed = 5;
    private int score = 50;
    private GreenfootSound s3 = new GreenfootSound("shot3.wav");
    
    
    public void act() 
    {
        if (this.isAtEdge() == true)
        {
            getWorld().removeObject(this);
            return;
        }
        double amplitude = 5.0;
        double frequency = 2.0;
        setLocation(getX()-speed, getY()+(int)(Math.sin((double)(getX()+speed)*frequency/95.5)*amplitude));
        //move in a sine wave pattern
        shoot();
    }    
    public void takeDamage(int d)
    {
        health -= d;
        if (health <= 0)
        {
            Stage1 stage = (Stage1)getWorld();
            stage.addScore(score);
            stage.removeObject(this);
            return;
        }
    }
    public void shoot ()
    {
        int a = Greenfoot.getRandomNumber(100);
        if (a == 2)
        {
            getWorld().addObject (new SmallShot(), this.getX(), this.getY());
            s3.setVolume(60);
            s3.play();
        }
    }
}
