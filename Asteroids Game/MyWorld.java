import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    HealthBar healthBar = new HealthBar();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1); 
        Ship ship = new Ship();
        addObject(ship, 450, 308);
        Rocks rocks = new Rocks();
        addObject(rocks, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650));
        Rocks rocks2 = new Rocks();
        addObject(rocks2, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650));
        Rocks rocks3 = new Rocks();
        addObject(rocks3, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650));
        Rocks rocks4 = new Rocks();
        addObject(rocks4, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650));
        
        
        addObject(counter, 83, 44);
        
        
        addObject(healthBar, 260, 68);
        healthBar.setLocation(210, 57);
    }
    public Counter getCounter(){
        return counter;
    }
    public HealthBar getHealthBar(){
        return healthBar;
    }
}
