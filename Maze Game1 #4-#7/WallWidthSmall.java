import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallWidthSmall extends Walls
{
    /**
     * Act - do whatever the WallBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WallWidthSmall(){
        getImage().scale(getImage().getWidth() *3,getImage().getHeight());
    }
    public void act()
    {
        // Add your action code here.
    }
}
