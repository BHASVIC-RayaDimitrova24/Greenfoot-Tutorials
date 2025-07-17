import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Actor
{
    /**
     * Act - do whatever the Spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int mouseX;
    int mouseY;
    public void act()
    {
        // Add your action code here.
        followMouse();
        fireProjectile();
        moveAround();
        if(isTouching(House.class)){
            Greenfoot.setWorld(new Level2());
        }
    }
    public void moveAround(){
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()+5, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX()+5, getY()+5);
        }
    }
    
    
    public void followMouse(){
        if(Greenfoot.getMouseInfo() != null){
            mouseX = Greenfoot.getMouseInfo().getX();
            mouseY = Greenfoot.getMouseInfo().getY();
        }
        turnTowards(mouseX, mouseY);
    }
    
    public void fireProjectile(){
        if(Greenfoot.mouseClicked(null)){
            Projectile p = new Projectile();
            getWorld().addObject(p, getX(), getY());
            p.setRotation(getRotation());
        }
    }
}
