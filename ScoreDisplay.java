import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * 
 * 
 * @author Brian Markhouse
 * @version (a version number or a date)
 */
public class ScoreDisplay extends Actor
{
    private int score = 0;
    private GreenfootImage image;
    public void act() 
    {
        image = new GreenfootImage("Score: "+score, 40, Color.BLUE, new Color(0, 0, 0, 0) );
        image.setFont(new Font("AR DESTINE", Font.PLAIN, 40));
        setImage(image);
    }
    public void setScore(int s)
    {
        score = s;
        image.drawImage(new GreenfootImage("Score: "+score, 40, Color.BLUE, new Color(0, 0, 0, 0) ), getX(), getY() );
    }
}
