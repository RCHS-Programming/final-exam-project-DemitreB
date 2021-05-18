import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cop extends Actor
{
    private int Speed = 3;
    private int Reset = 0;
    /**
     * Act - do whatever the Cop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        crash();
        setUp();
        Speed();
    }    
    
    public void move()
    {
        setLocation(getX(), getY() +Speed);
        if(isAtEdge())
        {
            setLocation( Greenfoot.getRandomNumber(800), 0);
            Reset = Reset +1;
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
            setLocation( Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(130));
        }
    }
    
    public void Speed()
    {
        if (Reset > 9)
        {
            Speed=5;
        }
        if (Reset > 15)
        {
            Speed=8
            ;
        }
    }
}
