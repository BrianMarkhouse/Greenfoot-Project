import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * enemy that spawns a group of similiar enemies
 * 
 * @author Brian Markhouse
 * @version (a version number or a date)
 */
public class Surge extends Enemy
{
    private int health = 1;
    private int speed = 5;
    private int spawnTimer = 10;
    private int spawnCount = 0;
    private int x, y; //initial spawn coordinates used to spawn the rest of the group
    private int score = 50;
    
    /**
     * Surge Constructor
     *
     * @param x initial x coordinate
     * @param y initial y coordinate
     */
    public Surge(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
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
        //moving in a sine wave pattern
        if (spawnCount < 5)
        {
            spawnGroup();
        }
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
    public void spawnGroup()
    {
        if (spawnTimer == 0)
        {
            getWorld().addObject(new SurgeC(), x, y );
            spawnTimer = 10;
            spawnCount++;
        }
        spawnTimer--;
    }
    public void shoot ()
    {
        int a = Greenfoot.getRandomNumber(100);
        if (a == 2)
        {
            getWorld().addObject (new SmallShot(), this.getX(), this.getY());
            Greenfoot.playSound("shot3.wav");
        }
    }
}
