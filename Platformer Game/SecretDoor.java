import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecretDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecretDoor extends Actor
{
    /**
     * Act - do whatever the SecretDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("left")){
            move(4);
        }
    }
}
