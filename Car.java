import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private int move = 6;
    private int Reset = 0;
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        changeSpeed();
    }    
    
    public void move()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() -move, getY());
            
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() +move, getY());
            
        }
    }
    
    public void changeSpeed()
    {
        if (Reset > 9)
        {
            move = 8;
        }
        if (Reset > 15)
        {
            move = 12;
        }
    }
}
