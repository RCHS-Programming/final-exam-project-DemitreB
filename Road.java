import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road extends World
{

    /**
     * Constructor for objects of class Road.
     * 
     */
    public Road()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
         
        addObject(new Car(), 400, 500);
        
        addObject(new Cop(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(100));
        addObject(new Cop(), Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(100));
        addObject(new Cop(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(100));
        addObject(new Cop(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(100));
        addObject(new Cop(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(100));
        addObject(new Cop(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(100));
        addObject(new Cop(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(100));
    }
}
