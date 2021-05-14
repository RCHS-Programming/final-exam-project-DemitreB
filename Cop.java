import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cop extends Actor
{
    /**
     * Act - do whatever the Cop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        crash();
        setUp();
    }    
    
    public void move()
    {
        setLocation(getX(), getY() +3);
        if(isAtEdge())
        {
            setLocation( Greenfoot.getRandomNumber(800), 0);
        }
    }
    
    public void crash()
    {
        if( isTouching(Car.class) )
        {
            removeTouching(Car.class);
            Greenfoot.stop();
        }
    }
    
    public void setUp()
    {
        if ( isTouching(Cop.class))
        {
            setLocation( Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(150));
        }
    }
}
