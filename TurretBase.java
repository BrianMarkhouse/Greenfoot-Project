import greenfoot.*;

/**
 * Turret enemy
 * 
 * @author Brian Markhouse 
 * @version (a version number or a date)
 */
public class TurretBase extends Enemy
{
    private TurretGun gun = new TurretGun();
    private int speed = 3;
    private int health = 5;
    private int score = 500;
    
    public void act() 
    {
        // Add your action code here.
        getWorld().addObject(gun, getX(), getY() );
        if (this.isAtEdge() == true)
        {
            Stage1 stage = (Stage1)getWorld();
            stage.removeObject(gun);
            stage.removeObject(this);
            return;
        }
        setLocation(getX() - speed, getY() );

        moveGun(speed); //keeping the turret's gun in the same place as the turret
    }
    public void moveGun(int speed)
    {
        gun.setLocation(getX() - speed, getY() );
    }
    
    public void takeDamage(int d)
    {
        health -= d;
        if (health <= 0)
        {
            Stage1 stage = (Stage1)getWorld();
            stage.addScore(score);
            stage.removeObject(gun);
            stage.removeObject(this);
            return;
        }
    }
   
}