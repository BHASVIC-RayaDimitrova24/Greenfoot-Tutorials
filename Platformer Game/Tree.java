import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends Actor
{
    /**
     * Act - do whatever the Tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
            move(-2);
        }
        if(Greenfoot.isKeyDown("left")){
            move(2);
        }
        if(getX() ==0){
            setLocation(getWorld().getWidth()-1, Greenfoot.getRandomNumber(205)+150);
        }
    }
}
