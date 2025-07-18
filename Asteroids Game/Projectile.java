import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends SpaceActors
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        Actor rocks = getOneIntersectingObject(Rocks.class);
        Actor debris = getOneIntersectingObject(Rocks.class);
        Actor debris2 = getOneIntersectingObject(Debris2.class);
        if(rocks!=null){
            getWorld().removeObject(rocks);
            getWorld().addObject(new Debris(), getX(), getY());
            getWorld().addObject(new Debris(), getX(), getY());
            MyWorld myWorld = (MyWorld) getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if(debris!=null){
            getWorld().removeObject(debris);
            getWorld().addObject(new Debris2(), getX(), getY());
            getWorld().addObject(new Debris2(), getX(), getY());
            MyWorld myWorld = (MyWorld) getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if(debris2!=null){
            getWorld().removeObject(debris2);
            MyWorld myWorld = (MyWorld) getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if(rocks !=null){
            getWorld().removeObject(debris);
            getWorld().removeObject(this);
        }
        
        else if(getX() ==0){
            getWorld().removeObject(this);
        }
        else if(getY() ==0){
            getWorld().removeObject(this);
        }
        else if(getX() ==899){
            getWorld().removeObject(this);
        }
        else if(getX() ==649){
            getWorld().removeObject(this);
        }
    }
}
